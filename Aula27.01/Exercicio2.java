package estruturaCondicional;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		int n1,n2,n3,maior=0;
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Digite o valor de n1");
		n1 = ler.nextInt();
		System.out.println("Digite o valor de n2");
		n2 = ler.nextInt();
		System.out.println("Digite o valor de n3");
		n3 = ler.nextInt();
		
		if(n1 > maior) {
			maior = n1;
		}
		if(n2 > maior) {
			maior = n2;
		}
		if(n3 > maior) {
			maior = n3;
		}
		
		System.out.println("O maior valor � :"+maior);
		
		if(n1 <= n2 && n2<= n3) {
			System.out.println(n1+" "+n2+" "+n3);
		}
		if(n1 <= n3 && n3 <= n2) {
			System.out.println(n1+" "+n3+" "+n2);
		}
		if(n2 <= n1 && n1<= n3) {
			System.out.println(n2+" "+n1+" "+n3);
		}
		if(n2 <= n3 && n3<= n1) {
			System.out.println(n2+" "+n3+" "+n1);
		}
		if (n3 <= n1 && n1 <= n2) 
	    {
	      System.out.println(n3+" "+n1+" "+n2);
	    }
		if (n3 <= n2 && n2 <= n1) 
	    {
	      System.out.println(n3+" "+n2+" "+n1);
	    }
		
		
	}

}
