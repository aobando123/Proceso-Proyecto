package com.proceso.services;

import java.util.List;

import org.bson.types.ObjectId;
import org.mongodb.morphia.Key;
import org.mongodb.morphia.query.UpdateOperations;
import org.mongodb.morphia.query.UpdateResults;

import com.mongodb.WriteResult;
import com.proceso.connection.ConnectionService;
import com.proceso.entities.ObjectEntity;
import com.proceso.entities.Task;

public class TaskService implements ServiceInterface {

	private ConnectionService con = new ConnectionService();
	public TaskService() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public Key<Task> create(ObjectEntity entity) {
		Task task = (Task) entity;
		return con.datastore().save(task);
	}


	@Override
	public Task read(ObjectId id) {

		return con.datastore().get(Task.class, id);
	}


	@Override
	public UpdateResults update(ObjectEntity entity, UpdateOperations operations) {
		
		Task task = (Task) entity;
		return con.datastore().update(task, operations);
		
	}


	@Override
	public WriteResult delete(ObjectEntity entity) {
		Task task = (Task) entity;
		return con.datastore().delete(task);
	}


	@Override
	public UpdateOperations<Task> createOperations() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Task> readAll() {
		// TODO Auto-generated method stub
		return null;
	}


}
