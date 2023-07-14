import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {

	public static void main(String[] args) {
		
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		int randomNumber = random.nextInt(100)+1;
		int entrada;
		int contador = 0;
		
		while(true) {
			System.out.println("Escolha um numero entre 1 - 100");
			entrada = scanner.nextInt();
			contador++;
			
			if(entrada == randomNumber) {
				System.out.println("Voce acertou!!!");
				System.out.println("Foram "+contador+ " tentativas.");
				break;
			} else if(entrada > randomNumber) {
				System.out.println("Mais baixo.");
			} else if(entrada < randomNumber) {
				System.out.println("Mais alto.");
			} else if(entrada == 0) {
				System.out.println("fodase");
				break;
			}else {
				System.out.println("nada");
			}
		}
		scanner.close();
	}

}
