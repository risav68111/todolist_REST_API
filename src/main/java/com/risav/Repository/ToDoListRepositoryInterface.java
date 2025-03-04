package com.risav.Repository;

import java.util.List;

import com.risav.Model.ToDoListModel;

public interface ToDoListRepositoryInterface {

  public void init();
  public void destroy();
  
  public List<ToDoListModel> getAllTasks();
  public ToDoListModel getById(int id);
  public List<ToDoListModel> getByTitle(String title);
  public List<ToDoListModel> getByDescription(String searchText);
  public ToDoListModel updateTask(int id, ToDoListModel updatedata);
  public boolean deleteTask(int id);
  public int addToList(ToDoListModel newtask);
}
