// 39) Faça um programa que leia 5 números inteiros usando o loop "while" e exiba a média aritmética dos valores lidos.


package listaexercicios2;

import java.util.Scanner;

public class exercicio039 {
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int soma = 0;
	        int count = 0;
	        
	        while (count < 5) {
	            System.out.print("Digite um número inteiro: ");
	            int numero = scanner.nextInt();
	            soma += numero;
	            count++;
	        }
	        
	        double media = (double) soma / 5;
	        System.out.println("A média aritmética é: " + media);
	        
	        scanner.close();
	    }

}
