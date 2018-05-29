package com.proceso.entities;

import java.util.List;

import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Reference;

@Entity()
public class TaskSchema extends ObjectEntity{
	private String TaskName;
	@Reference(idOnly = true)
	private UserType AssignedGroup;
	@Embedded
	private List<ToDo> AssignedToDos;
	public TaskSchema() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param taskName
	 */
	public TaskSchema(String taskName) {
		super();
		setTaskName(taskName);
	}
	public UserType getAssignedGroup() {
		return AssignedGroup;
	}
	public void setAssignedGroup(UserType assignedGroup) {
		AssignedGroup = assignedGroup;
	}
	public List<ToDo> getAssignedToDos() {
		return AssignedToDos;
	}
	public void setAssignedToDos(List<ToDo> assignedToDos) {
		AssignedToDos = assignedToDos;
	}
	/**
	 * @return the taskName
	 */
	public String getTaskName() {
		return TaskName;
	}
	/**
	 * @param taskName the taskName to set
	 */
	public void setTaskName(String taskName) {
		TaskName = taskName;
	}

}
