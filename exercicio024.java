// 24) Crie um programa que leia três números inteiros e exiba-os em ordem crescente.


package listaexercicios2;

import java.util.Arrays;
import java.util.Scanner;

public class exercicio024 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] numeros = new int[3];
        
        System.out.print("Digite o primeiro número inteiro: ");
        numeros[0] = scanner.nextInt();
        
        System.out.print("Digite o segundo número inteiro: ");
        numeros[1] = scanner.nextInt();
        
        System.out.print("Digite o terceiro número inteiro: ");
        numeros[2] = scanner.nextInt();
        
        Arrays.sort(numeros);
        
        System.out.println("Números em ordem crescente: " + numeros[0] + ", " + numeros[1] + ", " + numeros[2]);
        
        scanner.close();
    }

}
