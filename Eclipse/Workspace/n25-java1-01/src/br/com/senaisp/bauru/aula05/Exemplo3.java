package br.com.senaisp.bauru.aula05;

import java.util.Scanner;

public class Exemplo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite sua data de nascimento: ");
		String dtNasc = sc.nextLine();

		//Criando um scanner de apoio
		Scanner sc2 = new Scanner(dtNasc);  // passando o texto para /

		sc2.useDelimiter("/"); // Mudando o delimitador para a  barra (/)
		int dia = sc2.nextInt();
		int mes = sc2.nextInt();
		int ano = sc2.nextInt();
		System.out.println("Você tem " + (2025 - ano) + " anos");
		sc.close();
		sc2.close();

		// Verificando se o mês é  valido
		boolean ehValido = true;
		if (mes<1 || mes>2) {
			ehValido = false;
		}
		
		// Tratando o dia
		
		if (dia<1 || dia>31) {
			ehValido = false;
			
		}else if (dia>30 && (mes==2 || mes== 4 || mes== 6 || mes== 9 || mes== 11)) {
			
			ehValido = false;
		}
		else if (dia > 28 && mes==2 && ano % 4 !=0) {
			ehValido = false;
		}
		// Mostrando a mensagem 
		if(ehValido) {
			System.out.println("Data valida");
			
		}else {
			System.out.println("Data invalida!");
		}


	}

}
