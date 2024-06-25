// 31) Faça um programa que leia o valor do salário-mínimo e o salário de um funcionário, e exiba quantos salários-mínimos ele recebe.


package listaexercicios2;

import java.util.Scanner;

public class exercicio031 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor do salário-mínimo: ");
        double salarioMinimo = scanner.nextDouble();
        
        System.out.print("Digite o valor do salário do funcionário: ");
        double salarioFuncionario = scanner.nextDouble();
        
        double quantidadeSalariosMinimos = salarioFuncionario / salarioMinimo;
        
        System.out.println("O funcionário recebe " + quantidadeSalariosMinimos + " salários-mínimos.");
        
        scanner.close();
    }

}
