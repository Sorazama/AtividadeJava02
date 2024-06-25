// 58) Escreva um programa que leia um número inteiro e exiba a sequência de Fibonacci até o número lido usando o loop "do-while".

package listaexercicios2;

import java.util.Scanner;

public class exercicio058 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        
        int a = 0, b = 1;
        int fib = 0;
        
        do {
            System.out.print(fib + " ");
            fib = a + b;
            a = b;
            b = fib;
        } while (fib <= numero);
        
        scanner.close();
    }

}
