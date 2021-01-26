package generation;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		int segundos,horas,minutos,segTotal;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Escreva o tempo de duração do evento em segundos");
		segundos = ler.nextInt();
		
		horas = segundos/3600;
		minutos = (segundos%3600)/60;
		segTotal = (segundos%3600)%60;
		
		
		System.out.printf("Horas: %d %nMinutos: %d%nSegundos: %d%n",horas,minutos,segTotal);
		//System.out.println("horas: "+horas+" Minutos: "+minutos+" Segundos :"+segTotal);
	
	}

}
