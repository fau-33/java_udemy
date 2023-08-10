package fundamentos;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {
		
		double a = 1;// Implícita
		System.out.println(a);
		
		float b = (float) 1.123456788888;// Explícita (CAST) perda de informação
		System.out.println(b);
		
		int c = 4;
		byte d = (byte) c;// Explícita (CAST)
		System.out.println(d);
		
		double e = 1.9999999;
		int f = (int) e;// Explícita (CAST)
		System.out.println(f);

	}

}
