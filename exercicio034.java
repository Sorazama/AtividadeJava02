// 34) Escreva um programa que leia a nota de um aluno em uma prova e exiba uma mensagem indicando se ele passou ou não. A nota mínima para aprovação é 6.

package listaexercicios2;

import java.util.Scanner;

public class exercicio034 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a nota do aluno: ");
        double nota = scanner.nextDouble();
        
        if (nota >= 6) {
            System.out.println("Aluno aprovado");
        } else {
            System.out.println("Aluno reprovado");
        }
        
        scanner.close();
    }

}
