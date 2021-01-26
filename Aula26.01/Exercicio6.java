package generation;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		double x1,y1,x2,y2,d,p1,p2;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o x1");
		x1 = ler.nextDouble();
		System.out.println("Digite o y1");
		y1 = ler.nextDouble();
		System.out.println("Digite o x2");
		x2 = ler.nextDouble();
		System.out.println("Digite o y2");
		y2 = ler.nextDouble();
		
		//p1 = Math.pow((x2-x1), 2);
		//p2 = Math.pow((y1-y2), 2);
		
		//d = Math.sqrt(p1+p2);
		
		d = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
		
		//System.out.println("p1 :"+p1);
		//System.out.println("p2 :"+p2);
		System.out.printf("valor de D: %.2f",d);
	}
}
