package Nivel1_5y6;
import java.util.*;
import java.util.stream.Collectors;

public class Ejercicio5y6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	List<String> months = new ArrayList<String>();
	months.add("January");
	months.add("Febraury");
	months.add("March");
	months.add("April");
	months.add("May");
	months.add("June");
	months.add("July");
	months.add("August");
	months.add("September");
	months.add("October");
	months.add("November");
	months.add("December");
	
		
		
	//Ejercicio 5
	System.out.print("Ejercicio 5: ");	
	months.forEach(p -> System.out.print(p+", "));
	
	//Ejercicio 6
	System.out.print("\nEjercicio 6: ");
	months.stream().map(p->p+", ").forEach(System.out::print);
	
}
}
