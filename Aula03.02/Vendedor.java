package herancaJava;

public class Vendedor extends Pessoa{
	//atributos da classe
	private double valorVendas;
	private double comissao;
	private double salario;
	
	//metodo construtor
	
	public Vendedor(String nome,String endereco,String telefone) {
		super(nome,endereco,telefone);
	}
	
	public void Salario() {
		salario += valorVendas * comissao / 100;
		System.out.printf("Valor Salario + Comissão %.2f \n",salario);
	}

	public double getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	

}
