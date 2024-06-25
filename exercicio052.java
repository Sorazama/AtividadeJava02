// 52) Escreva um programa que calcule a soma dos números de 1 a 100 usando o loop "do-while".


package listaexercicios2;

public class exercicio052 {
	
	public static void main(String[] args) {
        int i = 1;
        int soma = 0;
        
        do {
            soma += i;
            i++;
        } while (i <= 100);
        
        System.out.println("A soma dos números de 1 a 100 é: " + soma);
    }

}
