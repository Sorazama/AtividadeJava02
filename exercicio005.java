// 5) Escreva um programa que leia o preço de um produto e a quantidade comprada, e calcule o valor total a ser pago com desconto de 10% se a quantidade for maior que 10 unidades.


package listaexercicios2;

import java.util.Scanner;

public class exercicio005 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o preço do produto: ");
        double preco = scanner.nextDouble();
        
        System.out.print("Digite a quantidade comprada: ");
        int quantidade = scanner.nextInt();
        
        double total = preco * quantidade;
        
        if (quantidade > 10) {
            total *= 0.9; // Aplica desconto de 10%
        }
        
        System.out.println("Valor total a ser pago: R$ " + total);
        
        scanner.close();
    }

}
