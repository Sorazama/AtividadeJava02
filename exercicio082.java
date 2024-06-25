// 82) Escreva um programa que leia 10 números inteiros e exiba a soma deles.

package listaexercicios2;

import java.util.Scanner;

public class exercicio082 {
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int soma = 0;
	        
	        System.out.println("Digite 10 números inteiros:");
	        for (int i = 0; i < 10; i++) {
	            int numero = scanner.nextInt();
	            soma += numero;
	        }
	        
	        System.out.println("A soma dos números digitados é: " + soma);
	        
	        scanner.close();
	    }

}
