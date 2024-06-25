// 64) Escreva um programa que calcule o fatorial de um número inteiro inserido pelo usuário usando o loop "do-while".

package listaexercicios2;

import java.util.Scanner;

public class exercicio064 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        
        int fatorial = 1;
        int i = 1;
        
        do {
            fatorial *= i;
            i++;
        } while (i <= numero);
        
        System.out.println("O fatorial de " + numero + " é: " + fatorial);
        
        scanner.close();
    }

}
