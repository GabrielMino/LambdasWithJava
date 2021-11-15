package Nivel1_1;
import java.util.*;
import java.util.stream.*;

public class Ejercicio1 {

public static List<String> search(List<String> list){
	
	return list.stream()
			  .filter(s -> s.startsWith("A"))
			  .filter(s -> s.length() == 3)
			  .toList();
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		List<String> nombres =new ArrayList<String>();
		nombres.add("Ana");
		nombres.add("Jose");
		nombres.add("Maria");
		nombres.add("Diego");
		nombres.add("Gabriel");
		nombres.add("Amy");
		
		System.out.println(search(nombres));
		
	}

}
