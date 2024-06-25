// 28) Faça um programa que leia o peso e a altura de uma pessoa e exiba o seu Índice de Massa Corporal (IMC) e a sua classificação. Considere a tabela de classificação do IMC.

package listaexercicios2;

import java.util.Scanner;

public class exercicio028 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o peso (em kg): ");
        double peso = scanner.nextDouble();
        
        System.out.print("Digite a altura (em metros): ");
        double altura = scanner.nextDouble();
        
        double imc = peso / (altura * altura);
        
        System.out.println("Índice de Massa Corporal (IMC): " + imc);
        
        if (imc < 18.5) {
            System.out.println("Classificação: Abaixo do peso");
        } else if (imc >= 18.5 && imc < 24.9) {
            System.out.println("Classificação: Peso normal");
        } else if (imc >= 25 && imc < 29.9) {
            System.out.println("Classificação: Sobrepeso");
        } else {
            System.out.println("Classificação: Obesidade");
        }
        
        scanner.close();
    }

}
