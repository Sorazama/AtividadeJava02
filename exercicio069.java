// 69) Faça um programa que leia 5 números inteiros e exiba a média aritmética dos valores lidos.

package listaexercicios2;

import java.util.Scanner;

public class exercicio069 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        
        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o " + i + "º número inteiro: ");
            int numero = scanner.nextInt();
            soma += numero;
        }
        
        double media = (double) soma / 5;
        System.out.println("A média aritmética dos números é: " + media);
        
        scanner.close();
    }

}
