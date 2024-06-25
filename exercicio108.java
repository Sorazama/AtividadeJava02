// 108) Faça um programa que leia uma matriz 4x4 de números inteiros e exiba o maior valor presente em cada linha.


package listaexercicios2;

import java.util.Scanner;

public class exercicio108 {
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int[][] matriz = new int[4][4];
	        
	        System.out.println("Digite os elementos da matriz 4x4:");
	        for (int i = 0; i < 4; i++) {
	            for (int j = 0; j < 4; j++) {
	                matriz[i][j] = scanner.nextInt();
	            }
	        }
	        
	        for (int i = 0; i < 4; i++) {
	            int maior = Integer.MIN_VALUE;
	            for (int j = 0; j < 4; j++) {
	                if (matriz[i][j] > maior) {
	                    maior = matriz[i][j];
	                }
	            }
	            System.out.println("O maior valor da linha " + (i + 1) + " é: " + maior);
	        }
	        
	        scanner.close();
	    }

}
