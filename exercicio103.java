// 103) Escreva um programa que leia uma matriz 3x3 de números inteiros e exiba o menor valor presente na matriz.


package listaexercicios2;

import java.util.Scanner;

public class exercicio103 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int menor = Integer.MAX_VALUE;
        
        System.out.println("Digite os elementos da matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = scanner.nextInt();
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
        }
        
        System.out.println("O menor valor presente na matriz é: " + menor);
        
        scanner.close();
    }

}
