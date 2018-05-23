package com.proceso.controller;

import java.util.List;

import com.proceso.entities.ObjectEntity;
import com.proceso.entities.User;
import com.proceso.services.UserService;

public class UserController {

	UserService us = new UserService();
	public UserController() {
		
	}

	
	public void Create(ObjectEntity entity) {
		us.create(entity);

	}

	
	public void Update(ObjectEntity entity) {
		// TODO Auto-generated method stub

	}

	public void Delete(ObjectEntity entity) {
		// TODO Auto-generated method stub

	}

	
	public User ReadObject(ObjectEntity entity) {
		
		return us.read(entity.getId());
	}

	
	public List<ObjectEntity> ReadAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
