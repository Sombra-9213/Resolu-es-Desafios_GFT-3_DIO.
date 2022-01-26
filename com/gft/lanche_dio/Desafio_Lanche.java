package com.gft.lanche_dio;

import java.util.Scanner;

public class Desafio_Lanche {
	
	public static void main(String[] args) {
		int X, Y;
		float preco = 0;
		
		Scanner input = new Scanner(System.in);
		X = input.nextInt();
		Y = input.nextInt();
		
		if (X == 1) {
			preco  = (float) (4.00 * Y);
		}else if (X == 2) {
			preco  = (float) (4.50 * Y);  //Implementei minha lógica dessa maneira
		}else if (X == 3) {
			preco  = (float) (5.00 * Y);  //Implementei minha lógica dessa maneira
		}else if (X == 4) {
			preco  = (float) (2.00 * Y); //Implementei minha lógica dessa maneira
		}else if (X == 5) {
			preco  = (float) (1.50 * Y); //Implementei minha lógica dessa maneira
		}
		
		System.out.printf("Total: R$ %.2f\n",preco);
	}
	
	
}
