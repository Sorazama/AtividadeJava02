// 110) Crie um programa que leia duas matrizes 2x2 de números inteiros e exiba a subtração entre elas.

package listaexercicios2;

import java.util.Scanner;

public class exercicio110 {
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int[][] matriz1 = new int[2][2];
	        int[][] matriz2 = new int[2][2];
	        int[][] subtracaoMatriz = new int[2][2];
	        
	        System.out.println("Digite os elementos da primeira matriz 2x2:");
	        for (int i = 0; i < 2; i++) {
	            for (int j = 0; j < 2; j++) {
	                matriz1[i][j] = scanner.nextInt();
	            }
	        }
	        
	        System.out.println("Digite os elementos da segunda matriz 2x2:");
	        for (int i = 0; i < 2; i++) {
	            for (int j = 0; j < 2; j++) {
	                matriz2[i][j] = scanner.nextInt();
	            }
	        }
	        
	        System.out.println("Subtração das duas matrizes 2x2:");
	        for (int i = 0; i < 2; i++) {
	            for (int j = 0; j < 2; j++) {
	                subtracaoMatriz[i][j] = matriz1[i][j] - matriz2[i][j];
	                System.out.print(subtracaoMatriz[i][j] + " ");
	            }
	            System.out.println();
	        }
	        
	        scanner.close();
	    }

}
