// 49) Escreva um programa que calcule o fatorial de um número inteiro inserido pelo usuário usando o loop "while".

package listaexercicios2;

import java.util.Scanner;

public class exercicio049 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        
        int fatorial = 1;
        int i = 1;
        
        while (i <= numero) {
            fatorial *= i;
            i++;
        }
        
        System.out.println("O fatorial de " + numero + " é " + fatorial);
        
        scanner.close();
    }

}
