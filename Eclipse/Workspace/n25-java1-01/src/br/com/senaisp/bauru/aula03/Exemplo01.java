package br.com.senaisp.bauru.aula03;

public class Exemplo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte by = 127; // -128 a 127
		by += 2 ;
		System.out.println(by);
		char Letra = 'A'; // Representa o númerico 65
		Letra += 3;
		System.out.println(Letra);
		if ('A' > 'a') { // a = 97
			System.out.println("A é maior que a");
		} else {
			System.out.println("a é maior que A");
		}
		char  Letra2  = 'X';
		System.out.println(Letra  + Letra2);
		System.out.println(' ' + Letra  + Letra2);
		int vl = 10;
		int vl2 = vl++ + 5; //Pós encremento vl++ + 5 // Pré encremento ++vl + 5
		System.out.println(vl + " " + vl2);
	 
		

	}

}
