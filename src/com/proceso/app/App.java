package com.proceso.app;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.List;

import org.bson.types.ObjectId;
import org.mongodb.morphia.Key;

import com.proceso.entities.*;
import com.proceso.controller.*;;
public class App {


	static PrintStream out = System.out;
	static BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
	static AppUserType AppUserT = new AppUserType();
	static AppInputType AppInputT = new AppInputType();
	static AppUser appUser = new AppUser();
	static AppProcess appProcess = new AppProcess();
	static User logUser = new User();
	public static void main(String[] args) {
		try {
			logUser = appUser.Login();
			if(logUser == null) {
				out.println("no User found");
			} else {
				out.println(logUser.getUserGroup().getUserTypeName());
				if(logUser.getUserGroup().getUserTypeName().equals("Admin")) {
					MenuAdmin();
				} else {
					out.println("No es admin");
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	static void MenuAdmin() {
		int opNum = 0;
		do 
		{

			out.println("Bienvenido a nuestro sistema que desea hacer?");
			out.println("1. Manejar grupos de usuario");
			out.println("2. Manejar tipos de variables");
			out.println("3. Manejar usuarios");
			out.println("4. Manejo de procesos");
			out.println("0. Salir");
	
			
			try {
				String op = in.readLine();
				opNum = Integer.parseInt(op);
				ExecuteAction(opNum);
			}catch(Exception e) {
				out.println("Por favor ingrese un numero");
			}
		
		}while( opNum != 0);
	}
	
	static void ExecuteAction(int op) throws IOException {
		switch(op) {
		case 1:
			AppUserT.Menu();
			break;
		
		case 2:
			AppInputT.Menu();
			break;
		case 3:
			appUser.Menu();
			break;
		case 4:
			appProcess.Menu();
			break;
			
		}
	}
	
	
	
	

}
