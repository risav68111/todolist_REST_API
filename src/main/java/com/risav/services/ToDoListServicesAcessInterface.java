package com.risav.services;

import java.util.List;

import com.risav.Model.ToDoListModel;

public interface ToDoListServicesAcessInterface {

  public List<ToDoListModel> getAllTasks();
  public ToDoListModel getById(int id);
  public int addToList(ToDoListModel newtask);
  public List<ToDoListModel> getByTitle(String title);
  public List<ToDoListModel> getByDescription(String searchText);
  public ToDoListModel updateTask(int id, ToDoListModel updatedata);
  public boolean deleteTask(int id);
  
}
