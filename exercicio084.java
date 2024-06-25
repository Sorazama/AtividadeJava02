// 84) Faça um programa que leia 5 números inteiros e exiba quantos deles são pares.


package listaexercicios2;

import java.util.Scanner;

public class exercicio084 {
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int countPares = 0;
	        
	        System.out.println("Digite 5 números inteiros:");
	        for (int i = 0; i < 5; i++) {
	            int numero = scanner.nextInt();
	            if (numero % 2 == 0) {
	                countPares++;
	            }
	        }
	        
	        System.out.println("Quantidade de números pares: " + countPares);
	        
	        scanner.close();
	    }

}
