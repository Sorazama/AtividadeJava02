// 17) Escreva um programa que leia a idade de uma pessoa e exiba uma mensagem indicando se ela é criança, adolescente, adulto ou idoso.


package listaexercicios2;

import java.util.Scanner;

public class exercicio017 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();
        
        if (idade >= 0 && idade <= 12) {
            System.out.println("Criança");
        } else if (idade >= 13 && idade <= 17) {
            System.out.println("Adolescente");
        } else if (idade >= 18 && idade <= 64) {
            System.out.println("Adulto");
        } else if (idade >= 65) {
            System.out.println("Idoso");
        } else {
            System.out.println("Idade inválida");
        }
        
        scanner.close();
    }

}
