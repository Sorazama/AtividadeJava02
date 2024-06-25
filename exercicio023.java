// 23) Escreva um programa que leia o nome de um mês e exiba a quantidade de dias que ele possui. Considere apenas meses válidos.


package listaexercicios2;

import java.util.Scanner;

public class exercicio023 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o nome do mês: ");
        String mes = scanner.next().toLowerCase();
        
        int dias;
        switch (mes) {
            case "janeiro":
            case "março":
            case "maio":
            case "julho":
            case "agosto":
            case "outubro":
            case "dezembro":
                dias = 31;
                break;
            case "abril":
            case "junho":
            case "setembro":
            case "novembro":
                dias = 30;
                break;
            case "fevereiro":
                dias = 28; // Não considerando anos bissextos
                break;
            default:
                dias = 0; // Mês inválido
                break;
        }
        
        if (dias == 0) {
            System.out.println("Mês inválido");
        } else {
            System.out.println("O mês de " + mes + " tem " + dias + " dias.");
        }
        
        scanner.close();
    }

}
