// 20) Escreva um programa que leia um número inteiro e exiba se ele é par ou ímpar.

package listaexercicios2;

import java.util.Scanner;

public class exercicio020 {
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Digite um número inteiro: ");
	        int numero = scanner.nextInt();
	        
	        if (numero % 2 == 0) {
	            System.out.println("O número é par");
	        } else {
	            System.out.println("O número é ímpar");
	        }
	        
	        scanner.close();
	    }

}
