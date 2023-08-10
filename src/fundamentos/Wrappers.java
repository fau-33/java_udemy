package fundamentos;



public class Wrappers {

	public static void main(String[] args) {
		
		// byte
		Byte b = 100;
		Short s = 1000;
		
		// Integer.parseInt(entrada.next());
		Integer i = 10000; //Int
		Long l = 1000000000L;
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(i / 3);
		
		Float f = 122.10F;
		System.out.println(f);
		
		Double d = 12345.6789;
		System.out.println(d);
		
		Boolean bo =Boolean.parseBoolean("false");
		System.out.println(bo.toString().toUpperCase());
		
		Character c = '#'; //Char
		System.out.println(c + "...");
		
		

	}

}
