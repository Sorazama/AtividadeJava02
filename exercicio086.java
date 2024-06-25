// 86) Crie um programa que leia 10 números inteiros e exiba-os em ordem crescente.

package listaexercicios2;

import java.util.Arrays;
import java.util.Scanner;

public class exercicio086 {
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int[] numeros = new int[10];
	        
	        System.out.println("Digite 10 números inteiros:");
	        for (int i = 0; i < 10; i++) {
	            numeros[i] = scanner.nextInt();
	        }
	        
	        Arrays.sort(numeros);
	        
	        System.out.println("Números em ordem crescente:");
	        for (int numero : numeros) {
	            System.out.println(numero);
	        }
	        
	        scanner.close();
	    }

}
