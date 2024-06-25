// 90) Faça um programa que leia 5 números inteiros e verifique se algum deles é igual a zero.

package listaexercicios2;

import java.util.Scanner;

public class exercicio090 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean temZero = false;
        
        System.out.println("Digite 5 números inteiros:");
        for (int i = 0; i < 5; i++) {
            int numero = scanner.nextInt();
            if (numero == 0) {
                temZero = true;
                break;
            }
        }
        
        if (temZero) {
            System.out.println("Pelo menos um dos números é igual a zero.");
        } else {
            System.out.println("Nenhum dos números é igual a zero.");
        }
        
        scanner.close();
    }

}
