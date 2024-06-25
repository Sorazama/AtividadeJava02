// 42) Faça um programa que leia um número inteiro e exiba se ele é um número primo usando o loop "while".

package listaexercicios2;

import java.util.Scanner;

public class exercicio042 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        
        int i = 2;
        boolean primo = true;
        
        while (i <= numero / 2) {
            if (numero % i == 0) {
                primo = false;
                break;
            }
            i++;
        }
        
        if (primo && numero > 1) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }
        
        scanner.close();
    }
	
}
