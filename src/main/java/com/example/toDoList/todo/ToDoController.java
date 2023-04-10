package com.example.toDoList.todo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ToDoController {
	
	@Autowired
	private ToDoService toDoService;
	@RequestMapping("/todos")
	public List<ToDo> getAllToDos(){
		return toDoService.getAllToDos();
	}
	@RequestMapping("/todos/{id}")
	public ToDo getToDo(@PathVariable Integer id) {
		return toDoService.getToDo(id);
	}
}
