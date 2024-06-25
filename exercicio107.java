// 107) Crie um programa que leia uma matriz 3x3 de números inteiros e exiba o produto dos elementos da diagonal secundária.

package listaexercicios2;

import java.util.Scanner;

public class exercicio107 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int produtoDiagonalSecundaria = 1;
        
        System.out.println("Digite os elementos da matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = scanner.nextInt();
                if (i + j == 2) {
                    produtoDiagonalSecundaria *= matriz[i][j];
                }
            }
        }
        
        System.out.println("O produto dos elementos da diagonal secundária é: " + produtoDiagonalSecundaria);
        
        scanner.close();
    }

}
