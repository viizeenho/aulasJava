package estruturaRepeticao;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		int idade,sexo,caracteristica,cont=0,pessoasCalmas=0,mNervosa=0,hAgressivo=0,oCalmos=0,nervosoMais40=0,calmoMenos18=0;
		Scanner ler = new Scanner(System.in);
		
		while(cont < 150 ) {
			System.out.println("Digite a sua idade :");
			idade = ler.nextInt();
			System.out.println("Digite o seu sexo :");
			System.out.println("1 -Feminino\n2 -Masculino\n3 -Outros");
			sexo = ler.nextInt();
			
			System.out.println("Escolha um das suas caracteristicas no menu :");
			System.out.println("\n 1 - Calma \n 2 - Nervosa \n 3 - Agressiva");
			caracteristica = ler.nextInt();
			
			if(caracteristica == 1) {
				pessoasCalmas ++;
			}
			if(sexo == 1 && caracteristica==2) {
				mNervosa++;
			}
			if(sexo== 2 && caracteristica ==3) {
				hAgressivo++;
			}
			if(sexo == 3 && caracteristica == 1) {
				oCalmos++;
			}
			if(idade > 40 && caracteristica == 2) {
				nervosoMais40++;
			}
			if(idade < 18 && caracteristica == 1) {
				calmoMenos18++;
			}
			
			cont++;
		}
		
		System.out.println("O numero de pessoas calmas :"+pessoasCalmas);
		System.out.println("O numero de mulheres nervosa :"+mNervosa);
		System.out.println("O numero de homens agressivos :"+hAgressivo);
		System.out.println("O numero de outros calmos :"+oCalmos);
		System.out.println("O numero de pessoas com mais de 40 anos nervosas :"+nervosoMais40);
		System.out.println("O numero de pessoas com menos de 18 anos calmas :"+calmoMenos18);
		
		
	}

}
