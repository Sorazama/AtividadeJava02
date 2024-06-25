// 25) Faça um programa que leia o número de faltas de um aluno em uma disciplina e exiba sua situação. Se o número de faltas for maior que 15, ele é reprovado por falta.

package listaexercicios2;

import java.util.Scanner;

public class exercicio025 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o número de faltas do aluno: ");
        int faltas = scanner.nextInt();
        
        if (faltas > 15) {
            System.out.println("Reprovado por falta");
        } else {
            System.out.println("Aprovado");
        }
        
        scanner.close();
    }

}
