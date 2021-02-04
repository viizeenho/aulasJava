package herancaJava;

public class Operario extends Pessoa{
	private double valorProducao;
	private double comissao;
	
	
	//metodo construtor
	
	public Operario(String nome, String endereco, String telefone, double valorProducao, double comissao) {
		super(nome,endereco,telefone);
		this.comissao = comissao;
		this.valorProducao = valorProducao;
	}
	
	//ImprimirInfo
	
	public void imprimirInfo() {
		
		super.imprimirInfo();
		System.out.println("Valor Producao :"+valorProducao);
		System.out.println("Comissão :"+comissao);
		System.out.println("Salario com a Comissão : R$"+salario());
		
		
	}
	
	//calculando salario
	
	public double salario() {
		
		double salario = (valorProducao * comissao)/100;
		
		return salario+valorProducao;
	}

	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	
}
