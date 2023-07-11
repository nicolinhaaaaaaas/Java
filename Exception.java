import java.util.*;
public class Exception {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// excecão = um evento que ocorre durante a execução do programa que, interrompe o flow normal das instruções
		try {
			
			
			System.out.println("Digite um numero para dividir: ");
			int x = scanner.nextInt();
			
			System.out.println("Digite outro numero: ");
			int y = scanner.nextInt();
			
			int z = x/y;
			
			System.out.println("Resultado: "+z);
		}
		catch(ArithmeticException e) {
			System.out.println("Nao eh possivel dividir por 0");
		}
		catch(InputMismatchException e) {
			System.out.println("Tem que digitar eh um numero");
		}
		finally {
			System.out.println("Isso sempre vai ser impresso");
			scanner.close();
		}
	}

}
