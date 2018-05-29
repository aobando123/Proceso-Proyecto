package com.proceso.controller;

import java.util.ArrayList;
import java.util.List;

import com.proceso.entities.ObjectEntity;
import com.proceso.services.ProcessSchemaService;

public class ProcessSchemaController implements ControllerInterface {

	ProcessSchemaService psService = new ProcessSchemaService();
	public ProcessSchemaController() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Create(ObjectEntity entity) {
		psService.create(entity);
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
	public ObjectEntity ReadObject(ObjectEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<ObjectEntity> ReadAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
