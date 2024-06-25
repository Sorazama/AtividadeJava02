// 73) Escreva um programa que leia um número inteiro e exiba a sequência de Fibonacci até o número lido.

package listaexercicios2;

import java.util.Scanner;

public class exercicio073 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        
        int a = 0, b = 1;
        int fib = 0;
        
        System.out.println("Sequência de Fibonacci até " + numero + ":");
        while (fib <= numero) {
            System.out.print(fib + " ");
            fib = a + b;
            a = b;
            b = fib;
        }
        
        scanner.close();
    }

}
