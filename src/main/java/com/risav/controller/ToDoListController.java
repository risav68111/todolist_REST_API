package com.risav.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.risav.Model.ToDoListModel;
import com.risav.services.ToDoListServicesAcessInterface;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/v1/todolist")
public class ToDoListController {

  @Autowired
  ToDoListServicesAcessInterface service;

  @GetMapping("/")
  public List<ToDoListModel> allTasks() {
    return service.getAllTasks();
  }

  @GetMapping("/id/{id}")
  public ToDoListModel byId(@PathVariable("id") int id) {
    return service.getById(id);
  }

  @PostMapping("/add")
  public int addToList(@RequestBody ToDoListModel newtask) {
    return service.addToList(newtask);
  }

  @GetMapping("/bytitle/{title}")
  public List<ToDoListModel> byId(@PathVariable("title") String title) {
    return service.getByTitle(title);
  }

  @PutMapping("/update/{id}")
  public ToDoListModel updateTask(@PathVariable("id") int id, @RequestBody ToDoListModel updatedata) {
    return service.updateTask(id, updatedata);
  }

}
