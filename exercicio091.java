// 91) Escreva um programa que leia 10 números inteiros e exiba a soma dos valores positivos e a soma dos valores negativos.

package listaexercicios2;

import java.util.Scanner;

public class exercicio091 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int somaPositivos = 0, somaNegativos = 0;
        
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            int numero = scanner.nextInt();
            if (numero > 0) {
                somaPositivos += numero;
            } else if (numero < 0) {
                somaNegativos += numero;
            }
        }
        
        System.out.println("Soma dos valores positivos: " + somaPositivos);
        System.out.println("Soma dos valores negativos: " + somaNegativos);
        
        scanner.close();
    }

}
