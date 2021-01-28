package estruturaRepeticao;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		int i,soma=0;
		Scanner ler = new Scanner(System.in);
		i = ler.nextInt();
		
		do {

			soma += i;
			i = ler.nextInt();
		
		}
		
		while(i != 0); 
					
		System.out.println("soma dos valores digitados = "+soma);
	}

}
