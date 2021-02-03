package pooJava;

import java.util.Scanner;

public class ex3Eletronico {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		produtoEletronico celular = new produtoEletronico();
		produtoEletronico celular2 = new produtoEletronico("Galaxy Fold II",14000,2021001);
		String modelo;
		double preco;
		int cod;
		
		//Iniciando objeto sem parametros
		
		//Inserindo nome como o set
		System.out.println("Cadastrando produto!");
		System.out.println("digite o modelo do celular :");
		modelo = ler.nextLine();
		System.out.println("digite o preço do celular :");
		preco = ler.nextDouble();
		System.out.println("digite o cod do produto :");
		cod = ler.nextInt();
		
		System.out.println();
		
		celular.setNomeProduto(modelo);
		celular.setPrecoProduto(preco);
		celular.setCodProduto(cod);
		
		System.out.println("Produto 1");
		System.out.println(celular.getNomeProduto());
		System.out.println(celular.getPrecoProduto());
		System.out.println(celular.getCodProduto());
		System.out.println("\n");
		
		System.out.println("Produto 2");
		celular2.imprimirInfo();
		
	}
}
