// 95) Crie um programa que leia 5 nomes e exiba-os em ordem alfabética.


package listaexercicios2;

import java.util.Arrays;
import java.util.Scanner;

public class exercicio095 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[5];
        
        System.out.println("Digite 5 nomes:");
        for (int i = 0; i < 5; i++) {
            nomes[i] = scanner.nextLine();
        }
        
        Arrays.sort(nomes);
        
        System.out.println("Nomes em ordem alfabética:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
        
        scanner.close();
    }

}
