package herancaJava;

public class Pessoa {

	//Atributos
	private String nome;
	private String endereco;
	private String telefone;
	
	//construtor com parametros 1
	
	public Pessoa (String nome, String endereco, String telefone) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	
	// construtor somente com nome 2 
	
	public Pessoa (String nome) {
		this.nome = nome;
	}
	
	// construtor sem parametro / fazer interacao com usuario
	
	public Pessoa () {
		
	}
	
	//Metodo imprimirInfo
	
	public void imprimirInfo() {
		System.out.println("Nome :"+this.nome);
		System.out.println("Endereço :"+this.endereco);
		System.out.println("Telefone :"+this.telefone);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
}
