// 97) Escreva um programa que leia uma matriz 2x2 de números inteiros e calcule a soma de todos os elementos.


package listaexercicios2;

import java.util.Scanner;

public class exercicio097 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[2][2];
        int soma = 0;
        
        System.out.println("Digite os elementos da matriz 2x2:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matriz[i][j] = scanner.nextInt();
                soma += matriz[i][j];
            }
        }
        
        System.out.println("A soma dos elementos da matriz é: " + soma);
        
        scanner.close();
    }

}
