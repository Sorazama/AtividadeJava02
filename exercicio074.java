// 74) Crie um programa que leia o nome e a idade de 5 pessoas e exiba a média das idades.


package listaexercicios2;

import java.util.Scanner;

public class exercicio074 {
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int somaIdades = 0;
	        
	        for (int i = 1; i <= 5; i++) {
	            System.out.print("Digite o nome da " + i + "ª pessoa: ");
	            String nome = scanner.next();
	            
	            System.out.print("Digite a idade de " + nome + ": ");
	            int idade = scanner.nextInt();
	            
	            somaIdades += idade;
	        }
	        
	        double mediaIdades = (double) somaIdades / 5;
	        System.out.println("A média das idades é: " + mediaIdades);
	        
	        scanner.close();
	    }

}
