package fundamentos;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {
		
		double a = 1; // implícita
		System.out.println(a);
		
		float b = (float) 1.1234567899999; // Explícita (CAST)
		System.out.println(b);
		
		int c = 340;
		byte d = (byte) c; // Explícita
		System.out.println(d);
		
		double e = 1.99999999;
		int f = (int) e; // Explícita (CAST)
		System.out.println(f);

	}

}
