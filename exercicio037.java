// 37) Escreva um programa que calcule a soma dos números de 1 a 100 usando o loop "while".

package listaexercicios2;

public class exercicio037 {
	
	public static void main(String[] args) {
        int i = 1;
        int soma = 0;
        
        while (i <= 100) {
            soma += i;
            i++;
        }
        
        System.out.println("A soma dos números de 1 a 100 é: " + soma);
    }

}
