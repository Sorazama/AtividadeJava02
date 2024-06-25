// 27) Crie um programa que leia a idade de uma pessoa e seu sexo (M ou F) e exiba uma mensagem indicando se ela pode ou não se aposentar. Homens podem se aposentar com 65 anos ou mais, e mulheres com 60 anos ou mais.


package listaexercicios2;

import java.util.Scanner;

public class exercicio027 {
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Digite a idade: ");
	        int idade = scanner.nextInt();
	        
	        System.out.print("Digite o sexo (M/F): ");
	        char sexo = scanner.next().charAt(0);
	        
	        boolean podeAposentar = false;
	        
	        if (sexo == 'M' || sexo == 'm') {
	            if (idade >= 65) {
	                podeAposentar = true;
	            }
	        } else if (sexo == 'F' || sexo == 'f') {
	            if (idade >= 60) {
	                podeAposentar = true;
	            }
	        } else {
	            System.out.println("Sexo inválido");
	        }
	        
	        if (podeAposentar) {
	            System.out.println("Pode se aposentar");
	        } else {
	            System.out.println("Não pode se aposentar");
	        }
	        
	        scanner.close();
	    }

}
