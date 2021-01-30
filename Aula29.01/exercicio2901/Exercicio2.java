package vetorMatriz;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {

		
		int vet[] = new int[10];
		int maior = 0, soma = 0;
		float media;

		Scanner ler = new Scanner(System.in);

		// povoando o vetor
		for (int i = 0; i < 10; i++) {
			System.out.printf("Digite o valor da sua %d° jogada :\n", i + 1);
			vet[i] = ler.nextInt();
		//Verificando se o valor digitado é valido	
			while (vet[i] <= 0 || vet[i] > 6) {
				System.out.printf("Digite o valor da sua %d° jogada novamente :\n", i + 1);
				vet[i] = ler.nextInt();
			}
			soma += vet[i];
			if (vet[i] == 6) {
				maior++;
			}

		}

		// imprimindo o vetor

		for (int i = 0; i < 10; i++) {
			System.out.println(vet[i]);
		}

		media = soma / 10;
		System.out.println("soma :" + soma);
		System.out.println("A media é de :" + media);
		System.out.println("O maior numero do dado apareceu " + maior + " vezes");

	}

}
