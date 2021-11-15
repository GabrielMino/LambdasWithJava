package Nivel1_4;

import java.util.*;

public class Ejercicio4 {
	
	
	public static List<String> searchLength(List<String> lista) {
		
		return lista.stream().
			filter(p->(p.contains("o")|| p.contains("O")) && p.length()>5).
			toList();
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> words = new ArrayList<>();
		
		words.add("Rojo");
		words.add("Verde");
		words.add("Negro");
		words.add("Azul");
		words.add("Amarillo");
		words.add("Naranja");
		words.add("Violeta");
		words.add("Negro");
		words.add("Blanco");
		words.add("Marron");
		words.add("Ocre");
		words.add("Orcela");
		
		System.out.println("Los colores que contienen más de 5 letras y la letra o son: \n"+searchLength(words));
		
		

	}

}
