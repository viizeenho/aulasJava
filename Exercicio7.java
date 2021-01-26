package generation;

import java.util.Scanner;

public class Exercicio7 {
 public static void main(String[] args) {
	int a,b,c,d,e,f=0,x,y;
	Scanner ler = new Scanner(System.in);
	
	System.out.println("Digite o valor de A :");
	a= ler.nextInt();
	System.out.println("Digite o valor de B :");
	b= ler.nextInt();
	System.out.println("Digite o valor de C :");
	c= ler.nextInt();
	System.out.println("Digite o valor de D :");
	d= ler.nextInt();
	System.out.println("Digite o valor de E :");
	e= ler.nextInt();
	
	x = (c*e - b*f)/(a*e-b*d);
	y = (a*f - c*d)/(a*e-b*d);
	
	System.out.println("O valor de X é :"+x+" o valor de Y é :"+y);
	
 }
}
