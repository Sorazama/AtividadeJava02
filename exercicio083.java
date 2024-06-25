// 83) Crie um programa que leia 7 números inteiros e exiba a média aritmética dos valores lidos.

package listaexercicios2;

import java.util.Scanner;

public class exercicio083 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        
        System.out.println("Digite 7 números inteiros:");
        for (int i = 0; i < 7; i++) {
            int numero = scanner.nextInt();
            soma += numero;
        }
        
        double media = (double) soma / 7;
        System.out.println("A média dos números digitados é: " + media);
        
        scanner.close();
    }

}
