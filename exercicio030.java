// 30) Crie um programa que leia o número de maçãs compradas e exiba o valor total a ser pago. O preço das maçãs é de R$ 0,50 cada se a quantidade for menor que 12 e R$ 0,40 cada se a quantidade for igual ou maior que 12.

package listaexercicios2;

import java.util.Scanner;

public class exercicio030 {
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Digite o número de maçãs compradas: ");
	        int quantidade = scanner.nextInt();
	        
	        double preco;
	        if (quantidade < 12) {
	            preco = 0.50;
	        } else {
	            preco = 0.40;
	        }
	        
	        double total = preco * quantidade;
	        
	        System.out.println("Valor total a ser pago: R$ " + total);
	        
	        scanner.close();
	    }

}
