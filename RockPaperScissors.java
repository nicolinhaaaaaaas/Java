import java.util.*;
public class RockPaperScissors {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
			String[] rps = {"r", "p", "s"}; // "r" = rock , "p" = paper , "s" = scissors
			String computerMove = rps[new Random().nextInt(rps.length)];
			
			String playerMove;
			while(true) {
				System.out.println("Por favor insira sua jogada (r)- Pedra ; (p)- Papel ; (s)- Tesoura");
				playerMove = scanner.next();
				if(playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s")) {
					break;
				}
				System.out.println(playerMove+ " nao eh valido.");
			}
			
			System.out.println("Computador usou: " + computerMove);
			
			if(playerMove.equals(computerMove)) {
				System.out.println("Empate!");
			}
			else if(playerMove.equals("r")) {
				if(computerMove.equals("p")) {
					System.out.println("Voce perdeu!");
				}
				else if(computerMove.equals("s")) {
					System.out.println("Voce venceu!");
				}
			}
			else if(playerMove.equals("p")) {
				if(computerMove.equals("s")) {
					System.out.println("Voce perdeu!");
				}
				else if(computerMove.equals("r")) {
					System.out.println("Voce venceu!");
				}
			}
			else if(playerMove.equals("s")) {
				if(computerMove.equals("r")) {
					System.out.println("Voce perdeu!");
				}
				else if(computerMove.equals("p")) {
					System.out.println("Voce venceu!");
				}
			}
			
			System.out.println("Jogar de novo? (s/n)");
			String playAgain = scanner.next();
			
			if(!playAgain.equals("s")){
				break;
			}	
			
		}
		scanner.close();
	}

}
