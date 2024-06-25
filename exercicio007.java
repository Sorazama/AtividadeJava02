// 7) Faça um programa que receba o salário base de um funcionário e calcule o seu salário líquido, considerando que o funcionário recebe 5% de comissão sobre o salário base.


package listaexercicios2;

import java.util.Scanner;

public class exercicio007 {
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Digite o salário base do funcionário: ");
	        double salarioBase = scanner.nextDouble();
	        
	        double comissao = salarioBase * 0.05;
	        double salarioLiquido = salarioBase + comissao;
	        
	        System.out.println("Salário líquido: R$ " + salarioLiquido);
	        
	        scanner.close();
	    }

}
