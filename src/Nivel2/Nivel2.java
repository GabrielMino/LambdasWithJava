package Nivel2;

import java.util.*;
import java.util.stream.*;

public class Nivel2 {
	
	
	public static void main(String[] args) {
		
		
		List <String> lst = Arrays.asList("Verde", "Rojo", "2",  "635", "Amarillo",
											"Azul","Blanco345","Negro","32","A4");
		
		
		// List sort by length (shortest to longest)
		List<String> sortedLength = lst.stream().
				sorted(Comparator.comparingInt(String::length)).
				collect(Collectors.toList());
		//Other way to do:
		//(Comparator.comparing(a ->a.length())).toList();
		System.out.print("List sort by length (shortest to longest):\n"+sortedLength);
		
		
		//List sort by inverse length (longest to shorter)
		List<String> sortedRevLength = lst.stream().
				sorted(Comparator.comparingInt((String::length)).reversed()).
				collect(Collectors.toList());
		System.out.print("\n\nList sort by inverse length (longest to shorter):\n"+sortedRevLength);
		
		//List sort alphabetically by first character	
		
		List <String> sortedFirstChar = lst.stream().
				sorted(Comparator.comparingInt(b->b.charAt(0))).
				collect(Collectors.toList());
		System.out.print("\n\nList sort alphabetically by first character:\n"+sortedFirstChar);
		
		//List which contains "e" first, everything else second. 
		List<String> sortedE = lst.stream().
				sorted(Comparator.comparing(a->!a.contains("e"))).
				collect(Collectors.toList());
		System.out.print("\n\nList which contains e first, everything else second: \n"+sortedE);
		
		//Modify all elements of the array to change the characters "a" to "4"
		List<String> a4 = lst.stream().
				map(p->p.replaceAll("(?i)a","4")).
				collect(Collectors.toList());
		System.out.print("\n\nModify all elements of the array to change the characters \"a\" to \"4\": \n"+a4);
	 	
		//Show only items that are 100% numeric. (even if saved as strings)
		List<String> numeric = lst.stream().
				filter(w->w.matches("[0-9]+")).
				collect(Collectors.toList());
		System.out.println("\n\nItems that are 100% numeric:\n"+ numeric);
	
		//
	
	}
}
				
		
			
			
				
				

