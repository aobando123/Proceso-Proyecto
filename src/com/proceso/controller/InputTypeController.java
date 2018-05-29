package com.proceso.controller;

import java.util.ArrayList;
import java.util.List;

import com.proceso.entities.InputType;
import com.proceso.entities.ObjectEntity;
import com.proceso.services.InputService;
public class InputTypeController implements ControllerInterface{
	private InputService iService = new InputService();
	public InputTypeController() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void Create(ObjectEntity entity) {
		iService.create(entity);
		
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
	public InputType ReadObject(ObjectEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public  ArrayList<InputType> ReadAll() {
		return (ArrayList<InputType>) iService.readAll();
	}



}
