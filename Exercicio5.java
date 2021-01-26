package generation;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		double n1,n2,n3,media;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite as suas notas :");
		System.out.println("Nota 1 :");
		n1 = ler.nextInt();
		System.out.println("Nota 2 :");
		n2 = ler.nextInt();
		System.out.println("Nota 3 :");
		n3 = ler.nextInt();
		
		n1 = n1*2;
		n2 = n2*3;
		n3 = n3*5;
		media = (n1+n2+n3)/10;
		
		System.out.println("Sua media é ="+media);
		
		
		
	}
}
