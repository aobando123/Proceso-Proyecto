package com.proceso.entities;



import java.util.List;

import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Reference;

@Entity()
public class ToDo extends ObjectEntity{
	private String ToDoDescription;
	/**
	 * @param toDoDescription
	 */
	public ToDo(String toDoDescription) {
		super();
		ToDoDescription = toDoDescription;
	}

	@Reference
	private InputType ToDoType;
	@Embedded
	private List<ToDoOption> Options;
	@Embedded
	private ToDoOption SelectedOption;
	
	
	public ToDo() {
		// TODO Auto-generated constructor stub
	}

	public InputType getToDoType() {
		return ToDoType;
	}

	public void setToDoType(InputType toDoType) {
		ToDoType = toDoType;
	}

	public List<ToDoOption> getOptions() {
		return Options;
	}

	public void setOptions(List<ToDoOption> options) {
		Options = options;
	}

	public ToDoOption getSelectedOption() {
		return SelectedOption;
	}

	public void setSelectedOption(ToDoOption selectedOption) {
		SelectedOption = selectedOption;
	}

	/**
	 * @return the toDoDescription
	 */
	public String getToDoDescription() {
		return ToDoDescription;
	}

	/**
	 * @param toDoDescription the toDoDescription to set
	 */
	public void setToDoDescription(String toDoDescription) {
		ToDoDescription = toDoDescription;
	}



}
