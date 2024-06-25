// 93) Faça um programa que leia 10 números inteiros e exiba quantos deles estão no intervalo de 10 a 50.


package listaexercicios2;

import java.util.Scanner;

public class exercicio093 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countIntervalo = 0;
        
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            int numero = scanner.nextInt();
            if (numero >= 10 && numero <= 50) {
                countIntervalo++;
            }
        }
        
        System.out.println("Quantidade de números no intervalo [10, 50]: " + countIntervalo);
        
        scanner.close();
    }

}
