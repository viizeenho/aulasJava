package herancaJava;

public class Administrador extends Pessoa {
	//Atributos da classe
	private double ajudaDeCusto;
	
	//metodo construtor
	public Administrador(String nome, String endereco, String telefone, double ajudaDeCusto) {
		super(nome,endereco,telefone);
		this.ajudaDeCusto = ajudaDeCusto;
		
	}
	//metodo construtor sem parametro
	public Administrador() {
		
	}
	
	public void imprimirInfo() {
		System.out.println(getNome());
		System.out.println(getEndereco());
		System.out.println(getTelefone());
		System.out.println(getAjudaDeCusto());
	}
	
	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}
	public void setAjudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}

	
}
