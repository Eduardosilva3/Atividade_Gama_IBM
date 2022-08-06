import java.util.Scanner;

public class OperacaoMultiplicacao {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int valor1, valor2;
		int resultado;
		
		System.out.println("Digite um valor inteiro: ");
		valor1 = teclado.nextInt();
		
		System.out.println("Digite outro valor inteiro: ");
		valor2 = teclado.nextInt();
		
		resultado = valor1*valor2;
		System.out.println("A Multiplicação entre "+valor1 + " e "+valor2+" = "+ resultado);
		
		teclado.close();
	}

}
