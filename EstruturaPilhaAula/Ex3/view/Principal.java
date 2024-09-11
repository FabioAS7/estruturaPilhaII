package view;

import java.util.Scanner;

import controller.FatController;

public class Principal {

	public static void main(String[] args) {
		
		int valor = 0;
		Scanner s = new Scanner(System.in);
		FatController f = new FatController();
		
		do {
			System.out.println("Digite um numero de 0 a 10");
			valor = s.nextInt();
			
			if(valor<0 || valor>10) {
				System.err.println("Valor invalido \n");
			}
			
		}while(valor<0 || valor>10);
		
		
		try {
			System.out.println("fatorial de " + valor + " e igual " + f.fatorial(valor));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
