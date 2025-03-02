package com.risav.Repository;

import java.util.ArrayList;
import java.util.List;

import com.risav.Model.ToDoListModel;

// @Repository
public class FakeToDoListData implements ToDoListRepositoryInterface {

  List<ToDoListModel> result= new ArrayList<>();
  
  

  @Override
  public List<ToDoListModel> getAllTasks() {

    result.add(new ToDoListModel(0, "Title ", "descriipton ", false));
    result.add(new ToDoListModel(1, "Title 1", "descriipton 1", true));
    result.add(new ToDoListModel(2, "Title 2", "descriipton 2", false));
    return result;
  }

  @Override
  public ToDoListModel getById(int id) {
    return new ToDoListModel(1, "byid 1", "descripton 1", true);
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
    return true;
  }

  @Override
  public int addToList(ToDoListModel newtask) {
    result.add(newtask);
    return newtask.getId();
  }

  @Override
  public void init() {
    System.out.println("Init Method called.");

    result.add(new ToDoListModel(0, "Title ", "descriipton ", false));
    result.add(new ToDoListModel(1, "Title 1", "descriipton 1", true));
    result.add(new ToDoListModel(2, "Title 2", "descriipton 2", false));
  }

  @Override
  public void destroy() {
    System.out.println("Destroy Method Called.");
  }

}
