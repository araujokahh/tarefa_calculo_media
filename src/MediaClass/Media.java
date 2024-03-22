package MediaClass;

import java.io.PrintStream;

public class Media {
	
	static int nota1 = 8;
	static int nota2 = 7;
	static int nota3 = 9;
	static int nota4 = 8;
	static float totalnotas;
	
	public static void main(String[] args) {
		calculoMedia();
		
	}
	
	public static void calculoMedia() {
		
		totalnotas = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.println("A sua média é: ");
		System.out.print(totalnotas);
	
	}
	
}

