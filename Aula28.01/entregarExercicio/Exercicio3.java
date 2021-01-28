package estruturaRepeticao;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		int idade=0,mais50=0,menos21=0;
		Scanner ler = new Scanner(System.in);
		
		
		while(idade != -99) {
			System.out.println("digite a sua idade :");
			idade = ler.nextInt();
			if(idade <=0 || idade > 100) {
				idade = -99;
			}
			if(idade<21 && idade != -99) {
				menos21++;
			}else if(idade > 50){
				mais50++;
			}	
		}
		
		System.out.println("Quantidade de pessoas com menos de 21 :"+menos21);
		System.out.println("Quantidade de pessoas com mais de 50 :"+mais50);
	}
}
