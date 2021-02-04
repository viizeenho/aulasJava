package herancaJava;

import java.util.Scanner;

public class TestePessoasFornecedor {
	public static void main(String[] args) {
	
	//Instaciando Objeto com os parametos	
	Pessoa pessoa1 = new Pessoa("Vinicius Menezes","Rua General Jardim","39719950");	
	
	//Instanciando sem os parametros
	Pessoa pessoa2 = new Pessoa();
	
	//Instanciando Funcionario
	Fornecedor fornecedor1 = new Fornecedor("João Barbosa","Alameda Santos", "89719966",5000,1000);
	
	//imprimindo informações do Objeto pessoa1
	System.out.println("Informações do Objeto pessoa1");
	System.out.println(pessoa1.getNome());
	System.out.println(pessoa1.getEndereco());
	System.out.println(pessoa1.getTelefone());
	
	System.out.println(" ");
	
	//Inserindo informaçoes com set
	pessoa2.setNome("Pedro");
	pessoa2.setEndereco("Avenida Paulista");
	pessoa2.setTelefone("399797561");
	//imprimindo no console
	System.out.println("Informações do Objeto pessoa2");
	pessoa2.imprimirInfo();
	
	
	System.out.println(" ");
		
	//Imprimindo informações do fornecedor1
	System.out.println("Imprimindo informações do fornecedor1");
	fornecedor1.imprimirInfo();
	System.out.println("Valor Credito - Valor Divida :"+fornecedor1.obterSaldo());
	
	
		
	}
}
