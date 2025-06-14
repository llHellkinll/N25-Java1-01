package br.com.senaisp.bauru.aula04;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite seu nome completo: ");
		String nome = sc.nextLine();
		//Obter o primeiro nome  e o ultimo nome que foi digitado
		//Exemplo:  Roberto Da Silva Sauro
		
		//Tratando para User que não sabe Ler.
		if (!nome.contains(" ")) nome = nome + " ";
		String priNome = nome.substring(0,nome.indexOf(" "));
		String ultNome = nome.substring(nome.lastIndexOf(" ")+1);
		
		System.out.println(priNome);
		System.out.println(ultNome);
		
		
	}
	
	

}
