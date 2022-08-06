import java.util.Scanner;

public class EstruturaCondicaoNotas {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String nome = "";
		double nota1 , nota2;
		double media;
		System.out.println("Digite o nome do Aluno: ");
		nome = teclado.nextLine();
		
		System.out.println("Digite a primeira nota de "+nome+" :");
		nota1 = teclado.nextDouble();
		
		System.out.println("Digite a segunda nota de "+nome+" :");
		nota2 = teclado.nextDouble();
		
		media = (nota1 + nota2) / 2;
		
		if(media >=5) {
			System.out.println("Parabens "+nome+ " Você foi aprovado! ");
		}else if(media<5) {
			System.out.println("Infelizmente o aluno "+nome+" foi Reprovado.");
		}
		
		teclado.close();

	}

}
