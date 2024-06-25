// 4) Faça um programa que receba três notas de um aluno (cada nota de 0 a 10) e calcule a média ponderada considerando pesos 2, 3 e 5 para as notas, respectivamente.


package listaexercicios2;

import java.util.Scanner;

public class exercicio004 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a primeira nota (peso 2): ");
        double nota1 = scanner.nextDouble();
        
        System.out.print("Digite a segunda nota (peso 3): ");
        double nota2 = scanner.nextDouble();
        
        System.out.print("Digite a terceira nota (peso 5): ");
        double nota3 = scanner.nextDouble();
        
        double mediaPonderada = (nota1 * 2 + nota2 * 3 + nota3 * 5) / 10;
        
        System.out.println("Média ponderada: " + mediaPonderada);
        
        scanner.close();
	}
}
