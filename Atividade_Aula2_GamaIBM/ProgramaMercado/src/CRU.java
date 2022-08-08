import java.util.ArrayList;
import java.util.Scanner;

public class CRU {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int escolha = 0;
		
		ArrayList<String> cadastroFrutas = new ArrayList<String>();
		System.out.println("--- Seja Bem Vindo ao sistema de Gerenciamento de Frutas.");
		do {
			System.out.println("Selecione a opção Desejada: \n");
			System.out.println("1 - Cadastrar Nova Fruta.");
			System.out.println("2 - Mostrar Todas as Frutas Cadastradas.");
			System.out.println("3 - Modificar Fruta cadastrada.");
			System.out.println("4 - Finalizar Sistema.");
			
			escolha = scan.nextInt();
			
			switch (escolha) {
			case 1:
				String opcao ="s";
				while(opcao.equalsIgnoreCase("s")) {
					System.out.println("Digite o nome da Fruta: ");
					cadastroFrutas.add(scan.next());
					System.out.println("Deseja Cadastrar outra fruta? (S) - sim / (N) - Não");
					opcao = scan.next();
					System.out.println("");
				
				}
				break;
				
			case 2: 
				System.out.println("--- Lista de Frutas Cadastradas --- ");
				System.out.println("--- ID ---   ---Fruta---");
				for(int i = 0; i <= cadastroFrutas.size()-1 ; i++) {
					System.out.println("--- "+i+" ---"+   "---"+cadastroFrutas.get(i)+"---");
				}
				break;
			case 3: 
				int idM = 0;
				System.out.println("Digite o ID da fruta que deseja modificar:");
				idM = scan.nextInt();
				System.out.println("Você esta modificando o registro da seguinte fruta: "+cadastroFrutas.get(idM));
				System.out.println("\nDigite o novo nome da fruta: ");
				cadastroFrutas.set(idM, scan.next());
				
				System.out.println("\n Modificação Realizada com Sucesso!");
				break;
			default:
				break;
			}
		}while(escolha != 4);
		
		System.out.println("Sistema Finalizado Com Sucesso!");

	}

}
