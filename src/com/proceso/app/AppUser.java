package com.proceso.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import com.proceso.controller.UserController;
import com.proceso.entities.User;

public class AppUser {
	
	static UserController uController = new UserController();
	static PrintStream out = System.out;
	static BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
	private static List<User> lstUser = new ArrayList<User>();
	static AppUserType appUserType = new AppUserType();
	

	public AppUser() {
		// TODO Auto-generated constructor stub
	}
	public void Menu () throws IOException {
		int opNum;
		out.println("Que desea hacer?");
		out.println("1. Crear usuarios");
		out.println("2. Ver usuarios");
		String opString = in.readLine();
		opNum = Integer.parseInt(opString);
		ExecuteActionUser(opNum);
	}
	
	public  User Login() throws IOException {
		User logUser = new User();
		out.println("Bienvenido a sistema de procesos, por favor digite la siguiente informacion");
		out.print("Correo de usuario: ");
		logUser.setEmail(in.readLine());
		out.println();
		out.println("Contraseña: ");
		logUser.setPassword(in.readLine());
		return  uController.Login(logUser);
		
		
		
	}
	private void ExecuteActionUser (int op) throws IOException {
		switch(op) {
		case 1:
			CreateUser();
			break;
		
		case 2:
			GetAllUser();
			break;
		}
	}
	
	private void CreateUser() throws IOException {
		int indexUT = 0;
		User newUser = new User();
		out.println("Digite el nombre del usuario");
		newUser.setUserName(in.readLine());
		out.println("Digite el correo del usuario");
		newUser.setEmail(in.readLine());
		out.println("Digite la contrasenna");
		newUser.setPassword(in.readLine());
		out.println("Seleccione el tipo de usuario");
		appUserType.GetAllUserType();
		indexUT = Integer.parseInt(in.readLine());
		newUser.setUserGroup(appUserType.GetUserType(indexUT - 1 ));
		uController.Create(newUser);
		
		
		
	}
	public void GetAllUser(){
		int count = 1;
		lstUser = uController.ReadAll() ; 
		for(User u : lstUser) {
			out.println(count++ + ". "+ u.getUserName());
			out.println(" email: " + u.getEmail());
			out.println(" type: " + u.getUserGroup().getUserTypeName());
		}

	}
	
	public User GetInputType(int index) {
		if(lstUser.isEmpty()) {
			lstUser = uController.ReadAll();
		}
		return lstUser.get(index);
	}



}
