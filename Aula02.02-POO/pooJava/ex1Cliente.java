package pooJava;

public class ex1Cliente {

	private String nomeCliente;
	private int idadeCliente;
	private String cpfCliente;

	//construtor
	public ex1Cliente(String nome,int idadeCliente, String cpfCliente) {
		this.nomeCliente = nome;
		this.idadeCliente = idadeCliente;
		this.cpfCliente = cpfCliente;
	}
	
	public void imprimirInfo() {
		System.out.println("Nome :"+nomeCliente);
		System.out.println("Idade :"+idadeCliente);
		System.out.println("cpf :"+cpfCliente);
		
	}

	public String getNome() {
		return nomeCliente;
	}

	public void setNome(String nome) {
		this.nomeCliente = nome;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public int getIdadeCliente() {
		return idadeCliente;
	}

	public void setIdadeCliente(int idadeCliente) {
		this.idadeCliente = idadeCliente;
	}

	public String getCpfCliente() {
		return cpfCliente;
	}

	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}
	
	

}
