package Nivel3;

import java.util.*;
import java.util.stream.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Alumnos> curso = new ArrayList<>();
		
		
		//Fill the list with 10 students.
		curso.add(new Alumnos("Gabriel",20,"JAVA",6));
		curso.add(new Alumnos("Antonio",23,"PHP",4));
		curso.add(new Alumnos("Ezequiel",17,"JAVA",5));
		curso.add(new Alumnos("Rodrigo",19,"PYTHON",8));
		curso.add(new Alumnos("Natalia",22,"PYTHON",2));
		curso.add(new Alumnos("Andrés",21,"JAVA",9));
		curso.add(new Alumnos("Pablo",30,"JAVA",6));
		curso.add(new Alumnos("Santiago",30,"PYTHON",4));
		curso.add(new Alumnos("Adrián",19,"PHP",6));
		curso.add(new Alumnos("Ana",30,"PHP",7));
	
		System.out.println("Nombres y edades:");
		//Displays the name and age of each student on the screen.
		curso.stream().flatMap(alumno -> Stream.of("Name: "+
				alumno.getNombre()+ ", Age: " + alumno.getEdad())).
				collect(Collectors.toList()).
				forEach(System.out::println);
				
		//Filter the list for all students whose name starts with "a", 
		//assign it to another list and display the new list 
		//(all with lambdas)
		
		List<Alumnos> curso2 = curso.stream().
				filter(alumno -> alumno.getNombre().startsWith("A")).
				toList();
		
		System.out.println("\nAlumnos que su nombre comienza con la letra A: "+curso2.toString());
				
		//Filter and display on screen students with a 5th or higher grade.
		System.out.print("\nAlumnos con una nota mayor igual a 5: ");
		curso.stream().filter(alumno->alumno.getNota()>=5).forEach(System.out::print);
		
		
		//Filter and display on screen students with a 5th or higher grade.
		System.out.println("\n");
		System.out.print("Alumnos con una nota mayor igual a 5 y que no estudian PHP: ");
		curso.stream().filter(alumno->alumno.getNota()>=5 && alumno.getCurso()!="PHP").forEach(System.out::print);
	
		//Shows all students who do JAVA and are of legal age.
		System.out.println("\n");
		System.out.print("Alumnos que cursan JAVA y son mayores de 18: ");
		curso.stream().filter(alumno -> alumno.getCurso()=="JAVA" && alumno.getEdad()>18).forEach(System.out::print);
	}

}

