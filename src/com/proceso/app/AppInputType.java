package com.proceso.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import com.proceso.controller.InputTypeController;
import com.proceso.entities.InputType;

public class AppInputType {

	static InputTypeController itController = new InputTypeController();
	static PrintStream out = System.out;
	static BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
	private static List<InputType> lstInputType = new ArrayList<InputType>();
	
	public AppInputType() {
		// TODO Auto-generated constructor stub
	}
	
	public void Menu () throws IOException {
		int opNum;
		out.println("Que desea hacer?");
		out.println("1. Crear tipo de respuestas");
		out.println("2. Ver tipos de respuestas");
		String opString = in.readLine();
		opNum = Integer.parseInt(opString);
		ExecuteActionInputType(opNum);
	}
	static void ExecuteActionInputType (int op) throws IOException {
		switch(op) {
		case 1:
			CreateInputType();
			break;
		
		case 2:
			GetAllInputType();
			break;
		}
	}
	
	static void CreateInputType() throws IOException {
		
		out.println("Digite el tipo de respuesta");
		InputType newInputType = new InputType(in.readLine());
		itController.Create(newInputType);
	}
	static void GetAllInputType(){
		int count = 1;
		lstInputType = itController.ReadAll() ; 
		for(InputType ut : lstInputType) {
			out.println(count++ + ". "+ ut.getInputTypeName());
		}

	}
	
	static InputType GetInputType(int index) {
		if(lstInputType.isEmpty()) {
			lstInputType = itController.ReadAll();
		}
		return lstInputType.get(index);
	}



}
