package estruturaRepeticao;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		int num,par=0,impar=0;
		Scanner ler = new Scanner(System.in);
		
		for(int i=0;i<5;i++) {
			System.out.println("digite um numero :");
			num = ler.nextInt();
			if(num%2 ==0) {
				par++;
			}else {
				impar++;
			}
		}
		
		System.out.println("Quantidade de numeros pares :"+par);
		System.out.println("Quantidade de numeros impares :"+impar);
	}

}
