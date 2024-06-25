// 41) Crie um programa que leia um número inteiro positivo e exiba todos os divisores desse número usando o loop "while".


package listaexercicios2;

import java.util.Scanner;

public class exercicio041 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();
        
        int i = 1;
        System.out.println("Divisores de " + numero + ":");
        while (i <= numero) {
            if (numero % i == 0) {
                System.out.println(i);
            }
            i++;
        }
        
        scanner.close();
    }

}
