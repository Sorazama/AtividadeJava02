// 53) Crie um programa que exiba os números pares de 1 a 50 usando o loop "do-while".


package listaexercicios2;

public class exercicio053 {
	
	public static void main(String[] args) {
        int i = 1;
        
        do {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        } while (i <= 50);
    }

}
