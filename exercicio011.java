// 11) Escreva um programa que calcule a média aritmética entre três números reais inseridos pelo usuário.

package listaexercicios2;

import java.util.Scanner;

public class exercicio011 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número real: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Digite o segundo número real: ");
        double num2 = scanner.nextDouble();
        
        System.out.print("Digite o terceiro número real: ");
        double num3 = scanner.nextDouble();
        
        double media = (num1 + num2 + num3) / 3;
        
        System.out.println("Média aritmética: " + media);
        
        scanner.close();
    }

}
