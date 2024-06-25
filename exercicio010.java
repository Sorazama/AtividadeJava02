// 10) Faça um programa que leia um número inteiro e exiba a sua tabuada de multiplicação até o décimo valor.

package listaexercicios2;

import java.util.Scanner;

public class exercicio010 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        
        scanner.close();
    }

}
