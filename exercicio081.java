// 81) Faça um programa que leia 5 números inteiros e exiba-os na ordem inversa em que foram digitados.

package listaexercicios2;

import java.util.Scanner;

public class exercicio081 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        
        System.out.println("Digite 5 números inteiros:");
        for (int i = 0; i < 5; i++) {
            numeros[i] = scanner.nextInt();
        }
        
        System.out.println("Números na ordem inversa:");
        for (int i = 4; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
        
        scanner.close();
    }

}
