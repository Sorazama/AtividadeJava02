// 105) Faça um programa que leia uma matriz 4x4 de números inteiros e exiba a soma dos elementos de cada coluna.

package listaexercicios2;

import java.util.Scanner;

public class exercicio105 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        
        System.out.println("Digite os elementos da matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }
        
        for (int j = 0; j < 4; j++) {
            int somaColuna = 0;
            for (int i = 0; i < 4; i++) {
                somaColuna += matriz[i][j];
            }
            System.out.println("Soma dos elementos da coluna " + (j + 1) + ": " + somaColuna);
        }
        
        scanner.close();
    }

}
