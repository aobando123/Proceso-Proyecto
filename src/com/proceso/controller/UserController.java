package com.proceso.controller;

import java.util.ArrayList;
import java.util.List;

import com.proceso.entities.InputType;
import com.proceso.entities.ObjectEntity;
import com.proceso.entities.User;
import com.proceso.services.UserService;

public class UserController implements ControllerInterface {

	UserService us = new UserService();
	public UserController() {
		
	}

	@Override
	public void Create(ObjectEntity entity) {
		us.create(entity);

	}

	@Override
	public void Update(ObjectEntity entity) {
		// TODO Auto-generated method stub

	}
	@Override
	public void Delete(ObjectEntity entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public User ReadObject(ObjectEntity entity) {
		
		return us.read(entity.getId());
	}

	@Override
	public ArrayList<User> ReadAll() {
		// TODO Auto-generated method stub
		return (ArrayList<User>) us.readAll();
	}
	
	public User Login(User logUser) {
		return us.UserLogon(logUser);
	}

}
