// 63) Faça um programa que leia um número inteiro e exiba os seus dígitos separadamente usando o loop "do-while".


package listaexercicios2;

import java.util.Scanner;

public class exercicio063 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        
        String numeroStr = Integer.toString(numero);
        int i = 0;
        
        do {
            System.out.println(numeroStr.charAt(i));
            i++;
        } while (i < numeroStr.length());
        
        scanner.close();
    }

}
