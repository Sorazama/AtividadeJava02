// 67) Escreva um programa que calcule a soma dos números de 1 a 100.

package listaexercicios2;

public class exercicio067 {
	
	public static void main(String[] args) {
        int soma = 0;
        for (int i = 1; i <= 100; i++) {
            soma += i;
        }
        System.out.println("A soma dos números de 1 a 100 é: " + soma);
	}

}
