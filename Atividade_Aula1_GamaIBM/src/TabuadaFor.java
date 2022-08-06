import java.util.Scanner;

public class TabuadaFor {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int valor = 0;
		System.out.println("Digite um valor Inteiro: ");
		valor = teclado.nextInt();
		
		System.out.println("Imprmindo a tabuada de "+valor+" Abaixo:");
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(valor+" x "+i+" = "+valor*i);
		}
		
		teclado.close();

	}

}
