package generation;

import java.util.Scanner;

public class Exercicio {
	public static void main(String[] args) {
		int anos,meses,dias,total;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite a sua idade em Anos,Meses e Dias :");
		System.out.println("Anos :");
		anos = ler.nextInt();
		System.out.println("Meses :");
		meses = ler.nextInt();
		System.out.println("Dias :");
		dias = ler.nextInt();
		
		total = anos * 365;
		
		total += meses * 30;
		
		total += dias;
		
		System.out.println("Sua idade em dias é : "+total);
	}

}
