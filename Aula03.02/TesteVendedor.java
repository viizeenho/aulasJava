package herancaJava;

import java.util.Scanner;

public class TesteVendedor {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		double pegar;
		Vendedor vendedor1 = new Vendedor("Jose Silva","Rua Bela cintra","39719950");
		
		System.out.println("Digite o valor que voce vendeu esse m�s :");
		vendedor1.setValorVendas(pegar= ler.nextDouble());
		
		System.out.println("Sua porcenttagem de comiss�o esse m�s � de 10%");
		vendedor1.setComissao(10);
		
		System.out.println("Digite o seu salario fixo :");
		vendedor1.setSalario(pegar = ler.nextDouble());
		
		System.out.println("Seu salario com a comiss�o :");
		vendedor1.Salario();
		
		
	}

}
