// 78) Faça um programa que leia um número inteiro e exiba os seus dígitos separadamente.

package listaexercicios2;

import java.util.Scanner;

public class exercicio078 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        
        String numeroStr = Integer.toString(numero);
        for (int i = 0; i < numeroStr.length(); i++) {
            System.out.println(numeroStr.charAt(i));
        }
        
        scanner.close();
    }

}
