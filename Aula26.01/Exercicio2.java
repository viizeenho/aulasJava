package generation;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		int dias,anos,meses,totalDias;
		Scanner ler = new Scanner(System.in);
		System.out.println("Escreva sua idade em dias :");
		totalDias = ler.nextInt();
		
		anos = totalDias/365;
		meses =(totalDias%365)/30;
		dias = (totalDias%365)%30;
		
		System.out.printf("Voce tem %d anos, %d meses e %d dias de vida ",anos,meses,dias);
	}
}
