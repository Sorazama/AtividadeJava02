// 21) Crie um programa que leia a idade de um grupo de pessoas e exiba quantas são menores de idade e quantas são maiores de idade.

package listaexercicios2;

import java.util.Scanner;

public class exercicio021 {
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        int menores = 0;
	        int maiores = 0;
	        
	        System.out.print("Digite o número de pessoas no grupo: ");
	        int numeroPessoas = scanner.nextInt();
	        
	        for (int i = 0; i < numeroPessoas; i++) {
	            System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
	            int idade = scanner.nextInt();
	            
	            if (idade < 18) {
	                menores++;
	            } else {
	                maiores++;
	            }
	        }
	        
	        System.out.println("Número de menores de idade: " + menores);
	        System.out.println("Número de maiores de idade: " + maiores);
	        
	        scanner.close();
	    }

}
