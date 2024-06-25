// 29) Escreva um programa que leia o nome e a nota de um aluno e exiba sua situação na disciplina. Se a nota for maior ou igual a 7, o aluno está aprovado. Caso contrário, está em recuperação.


package listaexercicios2;

import java.util.Scanner;

public class exercicio029 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.next();
        
        System.out.print("Digite a nota do aluno: ");
        double nota = scanner.nextDouble();
        
        if (nota >= 7) {
            System.out.println("O aluno " + nome + " está aprovado.");
        } else {
            System.out.println("O aluno " + nome + " está em recuperação.");
        }
        
        scanner.close();
    }

}
