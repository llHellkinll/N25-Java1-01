package br.com.senaisp.bauru.aula06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		int idade;
		do {
			try {
				System.out.println("Digite sua  idade: ");
				idade = sc.nextInt();
				System.out.println("Você nasceu  em " + (2025 - idade));
			} catch (InputMismatchException e) {
				// TODO Auto-generated catch block
				idade = 0;
				System.out.println("Você digitou uma idade invalida!");
				sc.nextLine();//Captura o valor com erro para não ficar em loop

			}catch (ArithmeticException e) {
				idade = 0;
				System.out.println("Divisão por o!");
				
			}catch ( Exception e ) {
				idade = 0;
				System.out.println("Erro geral!");
			}
		} while (idade<=0);

		sc.close();

	}
}
