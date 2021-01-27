package estruturaCondicional;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		int numero;
		double raiz,potencia;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um numero :");
		numero = ler.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("Seu numero é par :"+numero);
			raiz = Math.sqrt(numero);
			System.out.printf("A raiz quadrada do seu numero é :%2.2f%n",raiz);
		}else {
			System.out.println("Seu numero é impar :"+numero);
			potencia = Math.pow(numero, 2);
			System.out.printf("Seu numero elevado ao quadrado :%2.2f",potencia);
		}
	}
}
