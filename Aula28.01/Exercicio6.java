package estruturaRepeticao;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		int i,mult3=0,cont=0;
		Scanner ler = new Scanner(System.in);
		i = ler.nextInt();
		do {
			i = ler.nextInt();
			if(i%3 == 0 && i != 0) {
				mult3 +=i;
				cont++;
			}
		}
		while(i != 0); 

		System.out.println("Numero multiplos de 3 :"+mult3/cont);
		System.out.println("Valor do contador :"+cont);
	}
}
