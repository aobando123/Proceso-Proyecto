package com.proceso.entities;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Reference;
@Entity()
public class Task extends TaskSchema{
	@Reference(idOnly = true)
	private Status TaskStatus;
	@Reference
	private User ActionUser;
	

	public Task() {
		// TODO Auto-generated constructor stub
	}

}
