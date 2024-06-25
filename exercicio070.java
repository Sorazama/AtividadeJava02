// 70) Escreva um programa que leia um número inteiro e exiba a tabuada desse número até o décimo valor.

package listaexercicios2;

import java.util.Scanner;

public class exercicio070 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro para a tabuada: ");
        int numero = scanner.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        
        scanner.close();
    }

}
