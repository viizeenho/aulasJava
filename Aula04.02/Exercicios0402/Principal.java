package polimorfismoAbstract;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		//Cachorro com interação a o usuario
		
		//Objeto Scanner
		Scanner ler = new Scanner(System.in);
		
		//instanciando Objetos
		Cachorro cachorro = new Cachorro();
		Cavalo cavalo = new Cavalo();
		
		/*
		//Entando com informaçoes do cachorro
		System.out.println("Digite o nome do cachorro :");
		cachorro.setNome(ler.nextLine());
		//idade cachorro
		System.out.println("Digite a idade do cachorro :");
		cachorro.setIdade(ler.nextInt());
		//imprimindo nome e idade
		cachorro.imprimirInfo();
		//Digite o latido do cachorro
		ler.nextLine();
		System.out.println("");
		System.out.println("Digite o som do cachorro :");
		cachorro.emitirSom(ler.nextLine());
		*/
		System.out.println("\n");
		System.out.println("Informações do Cavalo");
		
		//passando informacoes por set
		
		cavalo.setNome("Trovão");
		cavalo.setIdade(13);
		cavalo.imprimirInfo();
		cavalo.emitirSom("Iiiihhhhhh iiiiihhhhhh");
		cavalo.correr("Cavalgando");
		
		System.out.println("\n");
		System.out.println("Informações da Preguiça");
		//Pssando parametro direto na instancia do objeto
		
		Preguica preguica = new Preguica("Ritinha",17);
		preguica.imprimirInfo();
		preguica.emitirSom("Preguiçaaaaaaaaaaaaa do mundo");
		preguica.correr("Devagar chegamos longeeeeeeee");
	}

}
