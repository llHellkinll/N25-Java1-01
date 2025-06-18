package br.com.senaisp.bauru.aula05;

import java.util.Scanner;

public class Exemplo10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um Número: ");
		int num = sc.nextInt();
		int res = 1;
		for (int i=num;i>1;i--) {
			res *= i; // res  = res * i
			//break//  quebra o laço de reetição
			
		}System.out.println("O fatorial de " + num + "é " + res);
		sc.close();
		
	}  

}
