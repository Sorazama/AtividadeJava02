// 102) Faça um programa que leia duas matrizes 2x2 de números inteiros e exiba o produto entre elas.

package listaexercicios2;

import java.util.Scanner;

public class exercicio102 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz1 = new int[2][2];
        int[][] matriz2 = new int[2][2];
        int[][] produtoMatriz = new int[2][2];
        
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
        
        System.out.println("Produto das duas matrizes 2x2:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                produtoMatriz[i][j] = matriz1[i][0] * matriz2[0][j] + matriz1[i][1] * matriz2[1][j];
                System.out.print(produtoMatriz[i][j] + " ");
            }
            System.out.println();
        }
        
        scanner.close();
    }

}
