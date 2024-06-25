// 13) Faça um programa que leia dois números inteiros e verifique se o primeiro é múltiplo do segundo.

package listaexercicios2;

import java.util.Scanner;

public class exercicio013 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Digite o segundo número inteiro: ");
        int num2 = scanner.nextInt();
        
        if (num2 != 0 && num1 % num2 == 0) {
            System.out.println(num1 + " é múltiplo de " + num2);
        } else {
            System.out.println(num1 + " não é múltiplo de " + num2);
        }
        
        scanner.close();
    }

}
