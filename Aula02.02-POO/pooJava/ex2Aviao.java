package pooJava;

public class ex2Aviao {
	
	private String modeloAviao;
	private int qtdAssentos;
	private String empresa;
	
	public ex2Aviao (String modeloAviao, int qtdAssentos, String empresa) {
		
		this.modeloAviao = modeloAviao;
		this.qtdAssentos = qtdAssentos;
		this.empresa = empresa;
		
	}
	
	public void imprimirInfo() {
		System.out.printf("Modelo do avião : %s%nQuantidade de assentos :%d%nEmpresa :%s",modeloAviao,qtdAssentos,empresa);
	}

	public String getModeloAviao() {
		return modeloAviao;
	}

	public void setModeloAviao(String modeloAviao) {
		this.modeloAviao = modeloAviao;
	}

	public int getQtdAssentos() {
		return qtdAssentos;
	}

	public void setQtdAssentos(int qtdAssentos) {
		this.qtdAssentos = qtdAssentos;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	
	
	

}
