package polimorfismoAbstract;

public class Cavalo extends Animal{

	public Cavalo(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}
	
	public Cavalo() {
		
	}
	
	@Override
	public void imprimirInfo() {
		System.out.println("Nome do cavalo : "+getNome());
		System.out.println("Idade cavalo :"+getIdade());
		
	}

	@Override
	public void emitirSom(String som) {
		// TODO Auto-generated method stub
		System.out.println("cavalo emitindo som : "+som);
		
	}

	@Override
	public void correr(String corre) {
		// TODO Auto-generated method stub
		System.out.println("Movimento do cavalo : "+corre);
		
	}

}
