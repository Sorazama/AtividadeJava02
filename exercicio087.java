// 87) Faça um programa que leia 10 números inteiros e exiba quantos deles são positivos.


package listaexercicios2;

import java.util.Scanner;

public class exercicio087 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countPositivos = 0;
        
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            int numero = scanner.nextInt();
            if (numero > 0) {
                countPositivos++;
            }
        }
        
        System.out.println("Quantidade de números positivos: " + countPositivos);
        
        scanner.close();
    }

}
