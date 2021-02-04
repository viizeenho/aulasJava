package herancaJava;

import java.text.NumberFormat;

public class Empregado extends Pessoa {
	//atributos da classe Empregado
	private int codigoSetor;
	private double salarioBase;
	private int imposto;
	
	//construtor com parametros
	
	public Empregado(String nome, String endereco, String telefone, int codigoSetor,double salarioBase, int imposto) {
		
		super(nome,endereco,telefone);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
		
	}
	
	//construtor sem parametros
	
	public Empregado() {
		
	}
	
	public double calcularSalario() {
		double salarioReal =(salarioBase * imposto) /100;
		salarioReal = this.salarioBase - salarioReal;
		return salarioReal;
		
		
	}
	
	public void imprimirInfo() {
		super.imprimirInfo();
		System.out.println("Codigo Setor :"+this.codigoSetor);
		System.out.printf("Salario Base : R$ %.2f\n",this.salarioBase);
		System.out.println("Porcentagem Imposto :"+this.imposto+"%");
	}

	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(int imposto) {
		this.imposto = imposto;
	}
	
	
}
