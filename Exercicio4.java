package generation;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		int A,B,C,R,S,D;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite 3 numeros");
		System.out.println("Numero 1 :");
		A = ler.nextInt();
		System.out.println("Numero 2 :");
		B = ler.nextInt();
		System.out.println("Numero 3 :");
		C = ler.nextInt();
		
		R = (int) Math.pow((A+B), 2);
		S = (int) Math.pow((B+C), 2);
		
		D = (R+S)/2;
		
		System.out.println(D);
		
	}
	
}
