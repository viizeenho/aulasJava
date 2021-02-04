package herancaJava;

public class Fornecedor extends Pessoa {
	//atributos do funcionario
	private double valorCredito;
	private double valorDivida;
	
	//construtor com parametros
	
	public Fornecedor(String nome, String endereco, String telefone, double valorCredito, double valorDivida){
		
		super(nome,endereco,telefone);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}
	
	//construtor sem parametros
	
	public Fornecedor() {
		
	}
	
	// metodo para obter a diferença entre os valores dos atributos valorCredito e valorDivida
	
	public double obterSaldo() {
		if(valorDivida > 0) {
			valorCredito -= valorDivida;
			return valorCredito;
		}else
			return valorCredito;
	}
	
	//ImprimirInfo
	
	public void imprimirInfo() {
		super.imprimirInfo();
		System.out.println("Valor Credito :"+valorCredito);
		System.out.println("valor Divida  :"+valorDivida);
	}

	public double getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}

	public double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	
}
