package br.com.senaisp.bauru.aula05;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Usando o Scanner  para ler um arquivo texto
		Scanner sc = new Scanner(Exercicio01.class.getResourceAsStream("aquivo.txt"));
		String linha = sc.nextLine(); // pegando cabeçalho
		Scanner sca = new Scanner (linha);
		sca.useDelimiter(";");
		//Imprimindo o cabeçalho
		while(sca.hasNext()) {
			System.out.print(sca.next()+"\t\t"); // \t igual tab
		}
		System.out.println();//pulando linha
		sca.close();//fechando Scanner de apoio
		while(sc.hasNextLine()) {
			linha = sc.nextLine();
			sca = new Scanner(linha);
			sca.useDelimiter(";");
			
			
		}
	}

}
