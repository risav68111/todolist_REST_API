package com.risav.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import com.risav.Model.TaskMapper;
import com.risav.Model.ToDoListModel;



public class ToDoListData implements ToDoListRepositoryInterface{


  @Autowired
  DataSource datasource;

  @Autowired
  JdbcTemplate jdbctemplate;

  @Override
  public void init() {
    System.out.println("Data Fetching for Mysql Database....");
  }

  @Override
  public void destroy() {
    System.out.println("Connection From Database Closed.");
  }

  @Override
  public List<ToDoListModel> getAllTasks() {
    
    List<ToDoListModel> result=  jdbctemplate.query("SELECT * FROM tasks;", new TaskMapper());
    
    return result;
  }

  @Override
  public ToDoListModel getById(int id) {
    
    List<ToDoListModel> result=  jdbctemplate.query("SELECT * FROM tasks where id =?;", new TaskMapper(), id);

    return result.size()>0 ? result.get(0) : null;
  }

  @Override
  public List<ToDoListModel> getByTitle(String title) {
    
    List<ToDoListModel> result=  jdbctemplate.query("SELECT * FROM tasks where title like ?;", new TaskMapper(), "%"+ title +"%");

    return  result;
  }

  @Override
  public ToDoListModel updateTask(int id, ToDoListModel updatedata) {
    int result = jdbctemplate.update("UPDATE TASKS SET title= ? , description= ? , completed = ? ;", updatedata.getTitle(), updatedata.getDescription(), updatedata.isCompleted(), id);
    
    return result==0 ? null: updatedata;
  }

  @Override
  public boolean deleteTask(int id) {
    return jdbctemplate.update("DELETE FROM tasks WHERE id= ?;", id)==0 ? false : true;
  }

  @Override
  public int addToList(ToDoListModel newtask) {

    SimpleJdbcInsert simpleJdbcinsert= new SimpleJdbcInsert(jdbctemplate);
    simpleJdbcinsert.withTableName("tasks");
    simpleJdbcinsert.usingGeneratedKeyColumns("id");
    
    Map<String, Object> parameter= new HashMap<String, Object>();

    parameter.put("title", newtask.getTitle());
    parameter.put("description", newtask.getDescription());
    parameter.put("completed", newtask.isCompleted());

    Number result= simpleJdbcinsert.executeAndReturnKey(parameter);
    
    return result.intValue();

  }

  @Override
  public List<ToDoListModel> getByDescription(String searchText) {
    
    List<ToDoListModel> result=  jdbctemplate.query("SELECT * FROM tasks where description like ?;", new TaskMapper(), "%"+ searchText +"%");

    return  result;
  }
  
}
