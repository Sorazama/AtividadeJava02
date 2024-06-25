// 50) Crie um programa que leia o nome e a idade de várias pessoas usando o loop "while" até que o nome "fim" seja informado. Ao final, exiba a média das idades.


package listaexercicios2;

import java.util.Scanner;

public class exercicio050 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int somaIdades = 0;
        int count = 0;
        
        while (true) {
            System.out.print("Digite o nome da pessoa (ou 'fim' para encerrar): ");
            String nome = scanner.next();
            
            if (nome.equalsIgnoreCase("fim")) {
                break;
            }
            
            System.out.print("Digite a idade de " + nome + ": ");
            int idade = scanner.nextInt();
            
            somaIdades += idade;
            count++;
        }
        
        if (count > 0) {
            double mediaIdades = (double) somaIdades / count;
            System.out.println("A média das idades é: " + mediaIdades);
        } else {
            System.out.println("Nenhuma idade foi informada.");
        }
        
        scanner.close();
    }

}
