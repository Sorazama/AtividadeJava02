// 94) Escreva um programa que leia 7 números inteiros e exiba apenas os números pares.

package listaexercicios2;

import java.util.Scanner;

public class exercicio094 {
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Digite 7 números inteiros:");
	        for (int i = 0; i < 7; i++) {
	            int numero = scanner.nextInt();
	            if (numero % 2 == 0) {
	                System.out.println(numero);
	            }
	        }
	        
	        scanner.close();
	    }

}
