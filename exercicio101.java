// 101) Crie um programa que leia uma matriz 4x4 de números inteiros e exiba a média aritmética dos elementos.

package listaexercicios2;

import java.util.Scanner;

public class exercicio101 {
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int[][] matriz = new int[4][4];
	        int soma = 0;
	        
	        System.out.println("Digite os elementos da matriz 4x4:");
	        for (int i = 0; i < 4; i++) {
	            for (int j = 0; j < 4; j++) {
	                matriz[i][j] = scanner.nextInt();
	                soma += matriz[i][j];
	            }
	        }
	        
	        double media = (double) soma / 16;
	        System.out.println("A média aritmética dos elementos da matriz é: " + media);
	        
	        scanner.close();
	    }

}
