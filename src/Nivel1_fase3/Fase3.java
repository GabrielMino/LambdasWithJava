package Nivel1_fase3;

public class Fase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Mi_Interface2 ref = (word) -> {
		String result = "";
		for (int i = word.length()-1;i>=0;i--) {
			result+=word.charAt(i);
			
			
		}
		return result;
	
		
	};
	
	String a = "hola buenos días";
	System.out.println(a+", reversed using lambda: "+ref.reverse(a));

}
}