// 88) Escreva um programa que leia 5 números inteiros e calcule a média dos valores pares e a média dos valores ímpares.

package listaexercicios2;

import java.util.Scanner;

public class exercicio088 {
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int somaPares = 0, countPares = 0;
	        int somaImpares = 0, countImpares = 0;
	        
	        System.out.println("Digite 5 números inteiros:");
	        for (int i = 0; i < 5; i++) {
	            int numero = scanner.nextInt();
	            if (numero % 2 == 0) {
	                somaPares += numero;
	                countPares++;
	            } else {
	                somaImpares += numero;
	                countImpares++;
	            }
	        }
	        
	        if (countPares > 0) {
	            double mediaPares = (double) somaPares / countPares;
	            System.out.println("Média dos valores pares: " + mediaPares);
	        } else {
	            System.out.println("Nenhum número par foi digitado.");
	        }
	        
	        if (countImpares > 0) {
	            double mediaImpares = (double) somaImpares / countImpares;
	            System.out.println("Média dos valores ímpares: " + mediaImpares);
	        } else {
	            System.out.println("Nenhum número ímpar foi digitado.");
	        }
	        
	        scanner.close();
	    }

}
