// 16) Faça um programa que verifique se um número é positivo, negativo ou zero.

package listaexercicios2;

import java.util.Scanner;

public class exercicio016 {
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Digite um número: ");
	        double numero = scanner.nextDouble();
	        
	        if (numero > 0) {
	            System.out.println("O número é positivo");
	        } else if (numero < 0) {
	            System.out.println("O número é negativo");
	        } else {
	            System.out.println("O número é zero");
	        }
	        
	        scanner.close();
	    }

}
