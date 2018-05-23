package com.proceso.services;

import java.util.List;

import org.bson.types.ObjectId;
import org.mongodb.morphia.Key;
import org.mongodb.morphia.query.UpdateOperations;
import org.mongodb.morphia.query.UpdateResults;

import com.mongodb.WriteResult;
import com.proceso.connection.ConnectionService;
import com.proceso.entities.ObjectEntity;
import com.proceso.entities.TaskSchema;

public class TaskSchemaService implements ServiceInterface {

	private ConnectionService con = new ConnectionService();
	public TaskSchemaService() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public Key<TaskSchema> create(ObjectEntity entity) {
		TaskSchema taskSchema = (TaskSchema) entity;
		return con.datastore().save(taskSchema);
	}


	@Override
	public TaskSchema read(ObjectId id) {

		return con.datastore().get(TaskSchema.class, id);
	}


	@Override
	public UpdateResults update(ObjectEntity entity, UpdateOperations operations) {
		
		TaskSchema taskSchema = (TaskSchema) entity;
		return con.datastore().update(taskSchema, operations);
		
	}


	@Override
	public WriteResult delete(ObjectEntity entity) {
		TaskSchema taskSchema = (TaskSchema) entity;
		return con.datastore().delete(taskSchema);
	}


	@Override
	public UpdateOperations<TaskSchema> createOperations() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<TaskSchema> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
