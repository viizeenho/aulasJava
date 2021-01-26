package generation;

import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		double distribuidor=0,impostos,fabricante,vlrTotal;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o valor do Fabrica");
		fabricante = ler.nextInt();
		
		impostos = (fabricante*0.45);
		distribuidor = (fabricante*0.28);
		vlrTotal = fabricante+impostos+distribuidor;
		
		System.out.println("O valor total o carro para o consumidor R$"+vlrTotal);
	}

}
