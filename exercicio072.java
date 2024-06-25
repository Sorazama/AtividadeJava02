// 72) Faça um programa que leia um número inteiro e exiba se ele é um número primo.

package listaexercicios2;

import java.util.Scanner;

public class exercicio072 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        
        boolean primo = true;
        if (numero <= 1) {
            primo = false;
        } else {
            for (int i = 2; i <= numero / 2; i++) {
                if (numero % i == 0) {
                    primo = false;
                    break;
                }
            }
        }
        
        if (primo && numero > 1) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }
        
        scanner.close();
    }

}
