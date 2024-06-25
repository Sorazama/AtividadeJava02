// 9) Crie um programa que leia o valor do depósito mensal em uma poupança e a taxa de juros mensal, e calcule o montante após 12 meses.

package listaexercicios2;

import java.util.Scanner;

public class exercicio009 {
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Digite o valor do depósito mensal: ");
	        double depositoMensal = scanner.nextDouble();
	        
	        System.out.print("Digite a taxa de juros mensal (em %): ");
	        double taxaJuros = scanner.nextDouble();
	        
	        double montante = 0;
	        for (int i = 0; i < 12; i++) {
	            montante += depositoMensal;
	            montante += montante * (taxaJuros / 100);
	        }
	        
	        System.out.println("Montante após 12 meses: R$ " + montante);
	        
	        scanner.close();
	    }

}
