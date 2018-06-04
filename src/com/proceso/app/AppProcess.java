package com.proceso.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import com.proceso.controller.ProcessSchemaController;
import com.proceso.entities.InputType;
import com.proceso.entities.ProcessSchema;
import com.proceso.entities.TaskSchema;
import com.proceso.entities.ToDo;
import com.proceso.entities.ToDoOption;

public class AppProcess {

	static ProcessSchemaController psController = new ProcessSchemaController();
	static PrintStream out = System.out;
	static BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
	private static List<ProcessSchema> lstProcess = new ArrayList<ProcessSchema>();
	static AppInputType appInputType = new AppInputType();
	static AppUserType appUserType = new AppUserType();
	
	public AppProcess() {
		// TODO Auto-generated constructor stub
	}
	
	public void Menu() throws IOException {
		int opNum;
		out.println("Que desea hacer?");
		out.println("1. Crear procesos");
		out.println("2. Ver procesos");
		String opString = in.readLine();
		opNum = Integer.parseInt(opString);
		ExecuteActionProcess(opNum);

	}
	
	private void ExecuteActionProcess (int op) throws IOException {
		switch(op) {
		case 1:
			CreateProcess();
			break;
		
		case 2:
			//GetAllUser();
			break;
		}
	}
	private void CreateProcess() throws IOException {
		int countTask = 0, userType;
		String endTask = "S";
		ArrayList<TaskSchema> lstTask = new ArrayList<>();
		TaskSchema newTask;
		ToDo newToDo;
		ToDoOption newOption;
		ProcessSchema newPSchema = new ProcessSchema();
		out.println("Por favor digite el nombre del proceso");
		newPSchema.setProcessName(in.readLine());
		out.println("A continuacion va a crear las tareas del proceso");

		
		
		do {
			int countTodos = 1;
			newTask = new TaskSchema();
			ArrayList<ToDo> lstToDos = new ArrayList<>();
			out.println("Por favor digite el nombre de la tarea");
			newTask.setTaskName(in.readLine());
			out.println("Seleccione al grupo de usuarios a la cual va dirigida la tarea");
			appUserType.GetAllUserType();
			userType = Integer.parseInt(in.readLine());
			newTask.setAssignedGroup(appUserType.GetUserType(userType-1));
			String continueToDo = "S";
			do {
				int index;
				String addOptions, continueOptions = "S";
				ArrayList<ToDoOption> lstOptions = new ArrayList<>();
				newToDo = new ToDo();
				out.println("Digite la  pregunta o descripcion del paso " + countTodos++);
				newToDo.setToDoDescription(in.readLine());
				out.println("Digite el tipo de dato del paso");
				appInputType.GetAllInputType();
				index = Integer.parseInt(in.readLine());
				InputType it = appInputType.GetInputType(index-1);
				newToDo.setToDoType(it);
				out.println("Desea agregar opciones al paso? S/N");
				addOptions = in.readLine();
				if(addOptions.toUpperCase().equals("S")) {
					while(continueOptions.toUpperCase().equals("S") ) {
						newOption = new ToDoOption();
						out.println("Agregue una descripcion de la opcion (lo que vera el usuario)");
						newOption.setOptionDescription(in.readLine());
						out.println("Agregue el valor de la opcion");
						newOption.setOptionValue(in.readLine());
						lstOptions.add(newOption);
						out.println("Desea agregar mas opciones al paso? S/N");
						continueOptions = in.readLine();
						
					}
					newToDo.setOptions(lstOptions);
				}
				lstToDos.add(newToDo);
				
				
				out.println("Desea agregar mas pasos a la tarea? S/N");
				continueToDo = in.readLine();
				
			}while(continueToDo.equals("S"));
			newTask.setAssignedToDos(lstToDos);
			lstTask.add(newTask);
			out.println("Desea terminar con el proceso? S/N");
			endTask =  in.readLine();
			
		}while (endTask.toUpperCase().equals("N"));
		newPSchema.setLstTasks(lstTask);
		psController.Create(newPSchema);
		
		
	}

}
