package com.risav.todolist_REST_API;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.risav")
public class ToDoListRestApiApplication {
	public static void main(String[] args) {
		SpringApplication.run(ToDoListRestApiApplication.class, args);
		System.out.println("Web Server Started ...");
	}
}
