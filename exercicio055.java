// 55) Escreva um programa que leia um número inteiro e exiba a tabuada desse número até o décimo valor usando o loop "do-while".

package listaexercicios2;

import java.util.Scanner;

public class exercicio055 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        
        int i = 1;
        
        do {
            System.out.println(numero + " x " + i + " = " + (numero * i));
            i++;
        } while (i <= 10);
        
        scanner.close();
    }

}
