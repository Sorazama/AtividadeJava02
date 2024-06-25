// 92) Crie um programa que leia 5 números inteiros e exiba-os em ordem decrescente.


package listaexercicios2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class exercicio092 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer[] numeros = new Integer[5];
        
        System.out.println("Digite 5 números inteiros:");
        for (int i = 0; i < 5; i++) {
            numeros[i] = scanner.nextInt();
        }
        
        Arrays.sort(numeros, Collections.reverseOrder());
        
        System.out.println("Números em ordem decrescente:");
        for (int numero : numeros) {
            System.out.println(numero);
        }
        
        scanner.close();
    }

}
