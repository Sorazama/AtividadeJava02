// 89) Crie um programa que leia 10 números inteiros e exiba a quantidade de números positivos e a quantidade de números negativos.

package listaexercicios2;

import java.util.Scanner;

public class exercicio089 {
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int countPositivos = 0, countNegativos = 0;
	        
	        System.out.println("Digite 10 números inteiros:");
	        for (int i = 0; i < 10; i++) {
	            int numero = scanner.nextInt();
	            if (numero > 0) {
	                countPositivos++;
	            } else if (numero < 0) {
	                countNegativos++;
	            }
	        }
	        
	        System.out.println("Quantidade de números positivos: " + countPositivos);
	        System.out.println("Quantidade de números negativos: " + countNegativos);
	        
	        scanner.close();
	    }

}
