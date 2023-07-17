import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	static ArrayList<String> hoteis = new ArrayList<>();
	static Scanner scanner = new Scanner(System.in);
	
	static Integer opcao;
	static String nome;
	static String remocao;
	static String modificar;
	static String novoNome;

	public static void main(String[] args) {
		
		
		while(true) {
			escolhas();
			opcao = scanner.nextInt();
			
			switch(opcao) {
			
			case 1:
				adicionarHotel();
			break;
			
			case 2:
				removerHotel();
			break;
			
			case 3:
				modificarHotel();
			break;
			
			case 4:
				imprimeHotel();
			break;
			
			case 0:
				System.out.println("Encerrando o sistema...");
				return;
			
			default:
				System.out.println("Opcao invalida.");
			break;
			}
		}
	}
	
	static void escolhas() {
		System.out.println("Bem vindo ao sistema de hotel, o que deseja fazer?");
		System.out.println("(1) - Adicionar um hotel ao sistema");
		System.out.println("(2) - Remover um hotel do sistema");
		System.out.println("(3) - Modificar um hotel do sistema");
		System.out.println("(4) - Imprimir os hoteis");
		System.out.println("(0) - Sair do sistema.");
	}
	
	static void adicionarHotel() {
		System.out.print("Deseja adicionar um hotel ao sistema? (1)- Sim ; (2)-Nao ");
		opcao = scanner.nextInt();
		
		if(opcao.equals(1)) {
			System.out.print("Digite o nome do novo Hotel: ");
			nome = scanner.next();
			if(nome != null) {
				hoteis.add(nome);
				System.out.println("Hotel: "+nome+" foi adicionado ao sistema com sucesso.");
			}
			else {
				System.out.println("Nome invalido");
			}
		}
		else {
			System.out.println("Operacao cancelada.");
		}
	}
	
	static void removerHotel() {
		System.out.print("Deseja remover um hotel do sistema? (1)- Sim ; (2)- Nao ");
		opcao = scanner.nextInt();
		
		if(opcao.equals(1)) {
			for(String nomes : hoteis) {
				System.out.println("\n"+hoteis);
			}
			System.out.println("Digite o nome do hotel que deseja remover");
			remocao = scanner.next();
			
			if(hoteis.contains(remocao)) {
				hoteis.remove(remocao);
				System.out.println("Hotel: "+ remocao + " removido do sistema.");
			}
			else {
				System.out.println("O hotel ao qual se refere nao existe no sistema.");
			}
		}
		else {
			System.out.println("Operacao cancelada.");
		}
	}
	
	static void modificarHotel() {
		System.out.print("Deseja modificar um hotel do sistema? (1)- Sim ; (2) - Nao ");
		opcao = scanner.nextInt();
		
		if(opcao.equals(1)) {
			for(String nomes : hoteis) {
				System.out.println("\n"+hoteis);
			}
			System.out.print("Digite o nome do hotel que deseja modificar: ");
			modificar = scanner.next();
			
			if(hoteis.contains(modificar)) {
				System.out.print("Digite o novo nome do Hotel: ");
				novoNome = scanner.next();
				
				hoteis.remove(modificar);
				hoteis.add(novoNome);
				
				System.out.println("Modificacao bem sucedida.");
				System.out.println("O Hotel "+modificar+ " agora eh: "+novoNome);
			}
			else {
				System.out.println("O hotel ao qual se refere nao existe no sistema.");
			}
		}
		else {
			System.out.println("Operacao cancelada");
		}
	}
	
	static void imprimeHotel() {
		System.out.println(hoteis);
	}
	
	static void adicionarCliente() {
		
	}
	
	static void removerCliente() {
		
	}

}
