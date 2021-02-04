package herancaJava;

public class TesteEmpregado {

	public static void main(String[] args) {
		//Instanciando o Objeto
		Empregado empregado1 = new Empregado("Vinicius Menezes","Rua General Jardim","39719950",1001,5000,15);
		
		//Imprimindo informações no console
		empregado1.imprimirInfo();
		
		System.out.println(" ");
		
		System.out.println("Descontando imposto do salario");
		System.out.printf("Salario com imposto incluido : R$ %.2f",empregado1.calcularSalario());
		

	}

}
