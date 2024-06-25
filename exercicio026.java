// 26) Escreva um programa que leia o código de um produto e a quantidade comprada, e exiba o valor total a ser pago. Considere que cada produto tem um preço diferente.

package listaexercicios2;

import java.util.Scanner;

public class exercicio026 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o código do produto: ");
        int codigo = scanner.nextInt();
        
        System.out.print("Digite a quantidade comprada: ");
        int quantidade = scanner.nextInt();
        
        double preco;
        switch (codigo) {
            case 1:
                preco = 10.0;
                break;
            case 2:
                preco = 20.0;
                break;
            case 3:
                preco = 30.0;
                break;
            default:
                preco = 0.0;
                System.out.println("Código de produto inválido");
                break;
        }
        
        if (preco != 0.0) {
            double total = preco * quantidade;
            System.out.println("Valor total a ser pago: R$ " + total);
        }
        
        scanner.close();
    }

}
