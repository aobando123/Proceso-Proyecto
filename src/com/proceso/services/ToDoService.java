package com.proceso.services;

import java.util.List;

import org.bson.types.ObjectId;
import org.mongodb.morphia.Key;
import org.mongodb.morphia.query.UpdateOperations;
import org.mongodb.morphia.query.UpdateResults;

import com.mongodb.WriteResult;
import com.proceso.connection.ConnectionService;
import com.proceso.entities.ObjectEntity;
import com.proceso.entities.ToDo;

public class ToDoService implements ServiceInterface {

	private ConnectionService con = new ConnectionService();
	public ToDoService() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public Key<ToDo> create(ObjectEntity entity) {
		ToDo toDo = (ToDo) entity;
		return con.datastore().save(toDo);
	}


	@Override
	public ObjectEntity read(ObjectId id) {

		return con.datastore().get(ToDo.class, id);
	}


	@Override
	public UpdateResults update(ObjectEntity entity, UpdateOperations operations) {
		
		ToDo toDo = (ToDo) entity;
		return con.datastore().update(toDo, operations);
		
	}


	@Override
	public WriteResult delete(ObjectEntity entity) {
		ToDo toDo = (ToDo) entity;
		return con.datastore().delete(toDo);
	}


	@Override
	public UpdateOperations<ToDo> createOperations() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<ToDo> readAll() {
		// TODO Auto-generated method stub
		return null;
	}


}
