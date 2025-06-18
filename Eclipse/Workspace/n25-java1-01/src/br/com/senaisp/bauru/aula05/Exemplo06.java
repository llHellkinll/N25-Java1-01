package br.com.senaisp.bauru.aula05;

import java.util.Scanner;

public class Exemplo06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc  = new Scanner(System.in);
		System.out.println("Digite um  Valor entre 1 e 5: ");
		int vlr  = sc.nextInt();
		switch(vlr) {
		
		case 1 -> System.out.println("Voce ganhou uma caneta!");
		
		case 2 -> System.out.println("Voce ganhou um Lápis!");
		
		case 3 -> System.out.println("Voce ganhou um borracha!");
		
		case 4 -> System.out.println("Voce ganhou um Bombom!");
		
		case 5 -> System.out.println("Voce ganhou um Bala!");
		
		default -> System.out.println("opção invalida!");	
		}
 
		sc.close();
	}

}
