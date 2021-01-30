package vetorMatriz;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		/*1.	Faça um programa que crie um vetor por leitura com 5 
		valores de pontuação de uma atividade e o escreva em seguida. 
		Encontre após a maior pontuação e a apresente. 
		*/
		
		double soma = 0;
		double vet[] = new double[5]; // Declarando e instaciando um vetor

		Scanner ler = new Scanner(System.in);
		
		//Alocando os valores no vetor
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite a sua pontuação :");
			vet[i] = ler.nextDouble();
			soma += vet[i];
		}
		
		//logica para encontrar o maior 
		double maior = vet[0], menor = vet[0];
		for(int i = 0; i< 5; i++) {
			if(vet[i]>maior){
				maior = vet[i];
			}
		}
		
		//saida de dados
		System.out.println("");
		
		for(int i = 0; i<5; i++) {
			
			if(vet[i] == maior) {
				System.out.printf("%.2f <---- esse é o maior numero\n",vet[i]);
			}else {
				System.out.printf("%.2f\n",vet[i]);
			}
		}
		System.out.println("Soma de todos os valores = "+soma);
	}
}
