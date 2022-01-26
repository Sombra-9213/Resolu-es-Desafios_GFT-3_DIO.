package com.gft.digitron_dio;

import java.io.IOException;
import java.util.Scanner;

public class Batalha_Digitrons {

	public static void main(String[] args) throws IOException {
		
//		ENTRADA
//		A entrada � composta por diversas inst�ncias. A primeira linha da entrada cont�m 
//		 um inteiro T indicando o n�mero de inst�ncias. Cada inst�ncia come�a com um 
//		 inteiro B (0 <= B <= 100), que indica o valor do b�nus aplicado. Nas duas linhas 
//		 seguintes ter�o tr�s inteiros Ai, Di e Li (1 <= Ai, Di <= 100, 1 <= Li <= 50), 
//		 representado o valor de ataque do Pomekon, o valor de defesa e o level do treinador. 
//		 A primeira linha representa o Pomekon de Dabriel e a segunda o de Guarte.
//		 
//		 SA�DA
//		 Para inst�ncia na entrada voc� dever� imprimir o nome do treinador que ir� vencer 
//		 a batalha, em caso de empate imprima: "Empate", sem aspas. 
//		 
		
			
		
		Scanner leitor = new Scanner(System.in);
    	int T = leitor.nextInt();
    	int B, A1, D1, L1, A2, D2, L2, V1, V2;
    	for (int i = 0; i < T; i++) {
    		B = leitor.nextInt();
    		
    		//Digitron de Bruno
    		A1 = leitor.nextInt();
    		D1 = leitor.nextInt();
    		L1 = leitor.nextInt();
    		
    		//Digitron de Guarte
    		A2 = leitor.nextInt();
    		D2 = leitor.nextInt();
    		L2 = leitor.nextInt();

    		V1 = ((A1 + D1) / 2) + (L1 % 2 == 0 ? B : 0); //L�gica para resolver o desafio.
    		V2 = ((A2 + D2) / 2) + (L2 % 2 == 0 ? B : 0); //L�gica para resolver o desafio.
    		
                if ( V1 > V2) System.out.println("Bruno"); //L�gica para resolver o desafio.
    		else if (V2 > V1 ) System.out.println("Guarte");  //L�gica para resolver o desafio.
    		else System.out.println("Empate");

	}

}
}
