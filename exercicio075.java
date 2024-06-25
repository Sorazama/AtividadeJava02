// 75) Faça um programa que exiba os primeiros 20 números da sequência de Fibonacci.

package listaexercicios2;

public class exercicio075 {
	
	 public static void main(String[] args) {
	        int a = 0, b = 1;
	        int count = 0;
	        
	        System.out.println("Os primeiros 20 números da sequência de Fibonacci são:");
	        while (count < 20) {
	            System.out.print(a + " ");
	            int fib = a + b;
	            a = b;
	            b = fib;
	            count++;
	        }
	    }

}
