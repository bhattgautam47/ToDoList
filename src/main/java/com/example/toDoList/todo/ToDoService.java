package com.example.toDoList.todo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class ToDoService {
	private List<ToDo> todos = new ArrayList<>(
			Arrays.asList(
					new ToDo(1,"task_1","summary_1","desc_1"),
					new ToDo(2,"task_2","summary_2","desc_2"),
					new ToDo(3,"task_3","summary_3","desc_3")
					)
			);
	public List<ToDo> getAllToDos(){
		return todos;
	}
	public ToDo getToDo(Integer id) {
		return todos.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
}
