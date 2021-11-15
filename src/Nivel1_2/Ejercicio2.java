package Nivel1_2;

import java.util.*;
//import java.util.stream.*;
import java.util.stream.Collectors;

public class Ejercicio2 {

	public static String evenorodd(List<Integer> lista){
		return		lista.stream().
				map(p->p%2 == 0 ? ("e"+p):("o"+p)).
				collect(Collectors.joining(", "));
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numLista = new ArrayList<Integer>();
	
		numLista.add(8);
		numLista.add(24);
		numLista.add(63);
		numLista.add(31);
		numLista.add(36);
		
		
		System.out.println("The numbers generated with the corresponding letter were added to the following String:\n"+
				evenorodd(numLista));
	}

}
