package herancaJava;

import java.util.Scanner;

public class TesteVendedor {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		double pegar;
		Vendedor vendedor1 = new Vendedor("Jose Silva","Rua Bela cintra","39719950");
		
		System.out.println("Digite o valor que voce vendeu esse mês :");
		vendedor1.setValorVendas(pegar= ler.nextDouble());
		
		System.out.println("Sua porcenttagem de comissão esse mês é de 10%");
		vendedor1.setComissao(10);
		
		System.out.println("Digite o seu salario fixo :");
		vendedor1.setSalario(pegar = ler.nextDouble());
		
		System.out.println("Seu salario com a comissão :");
		vendedor1.Salario();
		
		
	}

}
