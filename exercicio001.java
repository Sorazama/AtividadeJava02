// 1) Faça um programa que solicite dois números inteiros e exiba a soma, subtração, multiplicação e divisão entre eles.


package listaexercicios2;

import java.util.Scanner;

public class exercicio001 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Digite o segundo número inteiro: ");
        int num2 = scanner.nextInt();
        
        System.out.println("Soma: " + (num1 + num2));
        System.out.println("Subtração: " + (num1 - num2));
        System.out.println("Multiplicação: " + (num1 * num2));
        if (num2 != 0) {
            System.out.println("Divisão: " + ((double) num1 / num2));
        } else {
            System.out.println("Divisão: Não é possível dividir por zero");
        }
        
        scanner.close();
    }
	

}
