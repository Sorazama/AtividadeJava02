// 57) Faça um programa que leia um número inteiro e exiba se ele é um número primo usando o loop "do-while".


package listaexercicios2;

import java.util.Scanner;

public class exercicio057 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        
        int i = 2;
        boolean primo = true;
        
        do {
            if (numero % i == 0) {
                primo = false;
                break;
            }
            i++;
        } while (i <= numero / 2);
        
        if (primo && numero > 1) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }
        
        scanner.close();
    }

}
