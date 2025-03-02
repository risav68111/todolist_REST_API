package com.risav.todolist_REST_API;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.risav.Repository.ToDoListData;
import com.risav.Repository.ToDoListRepositoryInterface;

@Configuration
public class SpringConfig {

  @Bean(name="todolistRepository" ,initMethod="init", destroyMethod="destroy") 
  public ToDoListRepositoryInterface tododataRepo() {
    return new ToDoListData();
  }
  
}
