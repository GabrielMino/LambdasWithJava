package Nivel2;

public class Nivel2_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float a = (float) 12.5;
		float b = 7;
		Operacion suma = (x,y)->(x+y);
		Operacion resta = (x,y)->(x-y);
		Operacion multiplicacion = (x,y)->(x*y);
	    Operacion division = (x,y)-> (x/y) ; 
		
		
		System.out.println("La suma  de "+ a+" y "+ b+ " es igual a "+ suma.operacion(a, b));
		System.out.println("La resta de "+ a+" menos "+ b+ " es igual a "+ resta.operacion(a, b));
		System.out.println("La mutiplicación entre "+ a+" y "+ b+ " es igual a "+ multiplicacion.operacion(a, b));
		System.out.println("La división entre "+ a +" y "+ b+ " es igual a "+ division.operacion(a, b));
	}

}
