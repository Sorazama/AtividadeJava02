// 79) Escreva um programa que calcule o fatorial de um número inteiro inserido pelo usuário.

package listaexercicios2;

import java.util.Scanner;

public class exercicio079 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        
        int fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        
        System.out.println("O fatorial de " + numero + " é: " + fatorial);
        
        scanner.close();
    }

}
