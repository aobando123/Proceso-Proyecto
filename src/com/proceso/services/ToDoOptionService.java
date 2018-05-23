package com.proceso.services;

import java.util.List;

import org.bson.types.ObjectId;
import org.mongodb.morphia.Key;
import org.mongodb.morphia.query.UpdateOperations;
import org.mongodb.morphia.query.UpdateResults;

import com.mongodb.WriteResult;
import com.proceso.connection.ConnectionService;
import com.proceso.entities.ObjectEntity;
import com.proceso.entities.ToDoOption;

public class ToDoOptionService implements ServiceInterface {

	private ConnectionService con = new ConnectionService();
	public ToDoOptionService() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public Key<ToDoOption> create(ObjectEntity entity) {
		ToDoOption toDoOption = (ToDoOption) entity;
		return con.datastore().save(toDoOption);
	}


	@Override
	public ToDoOption read(ObjectId id) {

		return con.datastore().get(ToDoOption.class, id);
	}


	@Override
	public UpdateResults update(ObjectEntity entity, UpdateOperations operations) {
		
		ToDoOption toDoOption = (ToDoOption) entity;
		return con.datastore().update(toDoOption, operations);
		
	}


	@Override
	public WriteResult delete(ObjectEntity entity) {
		ToDoOption toDoOption = (ToDoOption) entity;
		return con.datastore().delete(toDoOption);
	}


	@Override
	public UpdateOperations<ToDoOption> createOperations() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<ToDoOption> readAll() {
		// TODO Auto-generated method stub
		return null;
	}


}
