package com.proceso.services;

import java.util.List;

import org.bson.types.ObjectId;
import org.mongodb.morphia.Key;
import org.mongodb.morphia.query.Query;
import org.mongodb.morphia.query.UpdateOperations;
import org.mongodb.morphia.query.UpdateResults;

import com.mongodb.DBCollection;
import com.mongodb.WriteResult;
import com.proceso.connection.ConnectionService;
import com.proceso.entities.ObjectEntity;
import com.proceso.entities.User;
import com.proceso.entities.UserType;

public class UserService implements ServiceInterface {

	public UserService() {
		// TODO Auto-generated constructor stub
	}

	private ConnectionService con = new ConnectionService();


	@Override
	public Key<User> create(ObjectEntity entity) {
		User user = (User) entity;
		return con.datastore().save(user);
	}


	@Override
	public User read(ObjectId id) {

		return con.datastore().get(User.class, id);
	}


	@Override
	public UpdateResults update(ObjectEntity entity, UpdateOperations operations) {
		
		User user = (User) entity;
		return con.datastore().update(user, operations);
		
	}


	@Override
	public WriteResult delete(ObjectEntity entity) {
		User user = (User) entity;
		return con.datastore().delete(user);
	}


	@Override
	public UpdateOperations<User> createOperations() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<User> readAll() {
		DBCollection m = con.datastore().getCollection( User.class );
		List<User> list = con.datastore().find( User.class ).asList();
		
		return list;
	}
	
	public User UserLogon(User logUser){
		Query<User> q = con.datastore().createQuery(User.class)
			.field("Email").equal(logUser.getEmail())
			.field("Password").equal(logUser.getPassword());
	
		return  q.get();
	}


}
