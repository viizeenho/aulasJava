package pooJava;

import java.text.NumberFormat;

public class produtoEletronico {

	private String nomeProduto;
	private double precoProduto;
	private int codProduto;
	
	//metodo construtor com parametros
	public produtoEletronico(String nomeProduto, double precoProduto, int codProduto) {
		
		this.nomeProduto = nomeProduto;
		this.precoProduto = precoProduto;
		this.codProduto = codProduto;
	}
	//metodo construtor sem parametros
	public produtoEletronico() {
		
		this.nomeProduto = nomeProduto;
		this.precoProduto = precoProduto;
		this.codProduto = codProduto;
	}
	
	public String formatarValor() {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		String formatarValor = nf.format(precoProduto);
		return formatarValor;
		
	}
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public double getPrecoProduto() {
		return precoProduto;
	}
	public void setPrecoProduto(double precoProduto) {
		this.precoProduto = precoProduto;
	}
	public int getCodProduto() {
		return codProduto;
	}
	public void setCodProduto(int codProduto) {
		this.codProduto = codProduto;
	}
	
	public void imprimirInfo() {
		System.out.printf("Modelo :%s\nPreço :%s\nCodigo produto :%d",nomeProduto,formatarValor(),codProduto);
	}
	
}
