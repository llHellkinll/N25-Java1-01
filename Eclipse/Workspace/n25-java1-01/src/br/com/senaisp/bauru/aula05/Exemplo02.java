package br.com.senaisp.bauru.aula05;

import java.util.Scanner;

public class Exemplo02 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		
		String nome = sc.next(); // Utiliza  o delimitador padrão
		
		System.out.println("Seu nome é " + nome);
		//Agora pegando o  nome completo
		
		System.out.println("Digite seu nome completo: ");
		
		sc.nextLine(); // Captura o enter do comando anterior  e evita que o proximo seja ignorado
		
		String nomeCompleto  = sc.nextLine(); // usa o delimitado \n
		
		System.out.println("Nome completo: " + nomeCompleto);
		
		sc.close();

	}

}
