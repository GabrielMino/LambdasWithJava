package Nivel1_3;

import java.util.*;

public class Ejercicio3 {
	
	
	public static List<String> searcho(List<String> lista) {
		
		return lista.stream().
			filter(p->p.contains("o")|| p.contains("O")).
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
		
		System.out.println("Los colores que contienen la letra o son:\n"+searcho(words));
		
		

	}

}
