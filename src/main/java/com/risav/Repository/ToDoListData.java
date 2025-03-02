package com.risav.Repository;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

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
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getById'");
  }

  @Override
  public List<ToDoListModel> getByTitle(String Title) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getByTitle'");
  }

  @Override
  public ToDoListModel updateTask(int id, ToDoListModel updatedata) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'updateTask'");
  }

  @Override
  public boolean deleteTask(int id) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'deleteTask'");
  }

  @Override
  public int addToList(ToDoListModel newtask) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'addToList'");
  }
  
}
