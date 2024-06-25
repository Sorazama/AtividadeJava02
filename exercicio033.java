// 33) Crie um programa que leia dois números inteiros e exiba o resultado da multiplicação entre eles.


package listaexercicios2;

import java.util.Scanner;

public class exercicio033 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Digite o segundo número inteiro: ");
        int num2 = scanner.nextInt();
        
        int resultado = num1 * num2;
        
        System.out.println("O resultado da multiplicação é: " + resultado);
        
        scanner.close();
    }

}
