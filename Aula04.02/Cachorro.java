package polimorfismoAbstract;

import java.util.Scanner;

public class Cachorro extends Animal {
	
	Scanner ler = new Scanner(System.in);

	public Cachorro(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}
	
	public Cachorro() {
		
	}

	@Override
	public void imprimirInfo() {
		System.out.println("Nome do cachorro : "+getNome());
		System.out.println("Idade cachorro :"+getIdade());
		
		
		
	}
	@Override
	public void emitirSom(String som) {
		// TODO Auto-generated method stub
		System.out.println("Cachorro latindo :"+som);
	}

	@Override
	public void correr(String corre) {
		// TODO Auto-generated method stub
		
		System.out.println(corre);
		
	}
	
	

}
