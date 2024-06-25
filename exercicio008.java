// 8) Escreva um programa que leia dois números inteiros e troque os seus valores, ou seja, o primeiro deve ficar com o valor do segundo e vice-versa.

package listaexercicios2;

import java.util.Scanner;

public class exercicio008 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Digite o segundo número inteiro: ");
        int num2 = scanner.nextInt();
        
        // Trocando os valores
        int temp = num1;
        num1 = num2;
        num2 = temp;
        
        System.out.println("Após a troca, o primeiro número é: " + num1);
        System.out.println("Após a troca, o segundo número é: " + num2);
        
        scanner.close();
    }

}
