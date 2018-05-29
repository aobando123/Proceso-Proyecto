package com.proceso.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import com.proceso.controller.UserTypeController;
import com.proceso.entities.UserType;

public class AppUserType {
	
	static UserTypeController utController = new UserTypeController();
	static PrintStream out = System.out;
	static BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
	private static List<UserType> lstUserType = new ArrayList<UserType>();
	public AppUserType() {
		// TODO Auto-generated constructor stub
	}
	
	public void Menu () throws IOException {
			int opNum;
			out.println("Que desea hacer?");
			out.println("1. Crear grupos de usuario");
			out.println("2. Ver grupos de usuario");
			String opString = in.readLine();
			opNum = Integer.parseInt(opString);
			ExecuteActionUserType(opNum);
			
		

	}
	
	private void ExecuteActionUserType (int op) throws IOException {
		switch(op) {
		case 1:
			CreateUserType();
			break;
		
		case 2:
			GetAllUserType();
			break;
		}
	}
	
	public void CreateUserType() throws IOException {
		
		out.println("Digite el grupo de usuario que desea agregar");
		UserType newUserType = new UserType(in.readLine());
		utController.Create(newUserType);
	}
	public void GetAllUserType(){
		int count = 1;
		lstUserType = utController.ReadAll() ; 
		for(UserType ut : lstUserType) {
			out.println(count++ + ". "+ ut.getUserTypeName());
		}

	}
	
	public UserType GetUserType(int index) {
		if(lstUserType.isEmpty()) {
			lstUserType = utController.ReadAll();
		}
		return lstUserType.get(index);
	}

}
