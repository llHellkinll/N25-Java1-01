package br.com.senaisp.bauru.aula04;

public class Exemplo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str01 = "Roberto da Silva Sauro";
		//Verificar se há dino no texto

		System.out.println(str01.contains ("dino"));

		//Obter a posição no texto de um subtexto
		System.out.println(str01.indexOf(8));

		//obter o caracter na posição desejada
		System.out.println(str01.charAt(3));

		//Obtendo a substring de uma string
		System.out.println(str01.substring(8));

		//obtendo ua substring de uma string limitando o final
		System.out.println(str01.substring(8,16));

		//usando o compareTo
		System.out.println(str01.compareTo("Roberval"));

	}

}
