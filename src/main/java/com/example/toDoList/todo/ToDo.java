package com.example.toDoList.todo;

public class ToDo {
	Integer id;
	String name;
	String summary;
	String descrption;
	
	
	
	public ToDo() {
	}
	public ToDo(Integer id, String name, String summary, String descrption) {
		super();
		this.id = id;
		this.name = name;
		this.summary = summary;
		this.descrption = descrption;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getDescrption() {
		return descrption;
	}
	public void setDescrption(String descrption) {
		this.descrption = descrption;
	}
	
	

}
