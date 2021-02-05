package polimorfismoAbstract;

public class Preguica extends Animal{

	public Preguica(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}

	public Preguica() {
		
	}
	
	@Override
	public void imprimirInfo() {
		System.out.println("Nome da Preguiça : "+getNome());
		System.out.println("Idade Preguiça :"+getIdade());
		
	}
	@Override
	public void emitirSom(String som) {
		// TODO Auto-generated method stub
		System.out.println("emitindo som : "+som);
		
	}

	@Override
	public void correr(String corre) {
		System.out.println("Subindo na arvore : "+corre);
		
	}

}
