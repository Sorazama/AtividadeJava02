// 38) Crie um programa que exiba os números pares de 1 a 50 usando o loop "while".


package listaexercicios2;

public class exercicio038 {
	
	public static void main(String[] args) {
        int i = 1;
        
        while (i <= 50) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }

}
