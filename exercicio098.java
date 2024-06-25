// 98) Crie um programa que leia uma matriz 3x3 de números inteiros e exiba a soma dos elementos da diagonal principal.


package listaexercicios2;

import java.util.Scanner;

public class exercicio098 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int somaDiagonalPrincipal = 0;
        
        System.out.println("Digite os elementos da matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = scanner.nextInt();
                if (i == j) {
                    somaDiagonalPrincipal += matriz[i][j];
                }
            }
        }
        
        System.out.println("A soma dos elementos da diagonal principal é: " + somaDiagonalPrincipal);
        
        scanner.close();
    }

}
