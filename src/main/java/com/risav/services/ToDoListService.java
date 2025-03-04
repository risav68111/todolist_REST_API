package com.risav.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.risav.Model.ToDoListModel;
import com.risav.Repository.ToDoListRepositoryInterface;


@Service
public class ToDoListService implements ToDoListServicesAcessInterface {

  @Autowired
  ToDoListRepositoryInterface data;


  @Override
  public List<ToDoListModel> getAllTasks() {
    return data.getAllTasks();
  }


  @Override
  public ToDoListModel getById(int id) {
    return data.getById(id);
  }


  @Override
  public List<ToDoListModel> getByTitle(String title) {
    return data.getByTitle(title);
  }


  @Override
  public ToDoListModel updateTask(int id, ToDoListModel updatedata) {
    return data.updateTask(id, updatedata);
  }


  @Override
  public boolean deleteTask(int id) {
    return data.deleteTask(id);
  }


  @Override
  public int addToList(ToDoListModel newtask) {
    return data.addToList(newtask);
  }


  @Override
  public List<ToDoListModel> getByDescription(String searchText) {
    return data.getByDescription(searchText);
  }

}
