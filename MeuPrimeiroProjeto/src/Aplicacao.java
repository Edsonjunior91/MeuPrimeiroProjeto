
public class Aplicacao {
	
	public static void main(String[] args) {
		
		String s = """
				 Este é um texto
		""";
		
		System.out.println(s);
		
		int i = 9;
		while ( i <= 10) {
			System.out.println(i++);
		}
		System.out.println(i);
		
		int $var;
		
		double d = 1.4;
		byte b = (byte)128;
		short e = 20;
		char c = 32;
		//float f = 1.4;
		
		System.out.println(b);
		
		int f = 10;
		while (f <= 10) {
			f = f+1;
		}
		System.out.println(i);
	}
}
