package com.risav.Model;

public class ToDoListModel {
  int id;
  String title;
  String description;
  boolean completed;

  
  public ToDoListModel(int id, String title, String description, boolean completed) {
    this.id = id;
    this.title = title;
    this.description = description;
    this.completed = completed;
  }

  
  @Override
  public String toString() {
    return "ToDoListModel [id=" + id + ", title=" + title + ", description=" + description + ", completed=" + completed
        + "]";
  }
  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }
  public boolean isCompleted() {
    return completed;
  }
  public void setCompleted(boolean completed) {
    this.completed = completed;
  }
}
