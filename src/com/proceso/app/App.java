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
	static AppUserType aut = new AppUserType();
	static InputTypeController iController = new InputTypeController();
	static UserController uController =  new UserController();
	public static void main(String[] args) {
		int opNum = 0;
		do 
		{

			out.println("Bienvenido a nuestro sistema que desea agregar?");
			out.println("1. Manejar grupos de usuario");
			out.println("2. Manejar tipos de variables");
	
			
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
		int opNum = 0;
		switch(op) {
		case 1:
			aut.Menu();
			break;
		
		case 2:
			out.println("Digite el tipo de variable que desea agregar");
			InputType newInputType = new InputType(in.readLine());
			iController.Create(newInputType);
			break;
		}
	}
	
	

}
