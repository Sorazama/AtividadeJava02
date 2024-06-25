// 60) Faça um programa que exiba os primeiros 20 números da sequência de Fibonacci usando o loop "do-while".

package listaexercicios2;

public class exercicio060 {
	
	public static void main(String[] args) {
        int a = 0, b = 1;
        int count = 0;
        
        do {
            System.out.print(a + " ");
            int fib = a + b;
            a = b;
            b = fib;
            count++;
        } while (count < 20);
    }

}
