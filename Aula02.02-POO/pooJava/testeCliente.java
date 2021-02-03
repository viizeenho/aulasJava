package pooJava;

public class testeCliente {

	public static void main(String[] args) {
		
		ex1Cliente c1 = new ex1Cliente("Vinicius",24 , "44444444400");
		
		System.out.println(c1.getNome());
		
		System.out.println(c1.getIdadeCliente());
		
		System.out.println(c1.getCpfCliente());
		
		System.out.println("***************************************************");
		
		c1.imprimirInfo();
	}
}
