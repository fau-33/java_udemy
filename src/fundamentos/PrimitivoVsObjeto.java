package fundamentos;

public class PrimitivoVsObjeto {

	public static void main(String[] args) {
		String s = new String("Meu texto");
		s.toUpperCase();
		
		// Wrappers são a versão objeto do tipo primitivos!
		int a = 123;
		System.out.println(a);

	}

}
