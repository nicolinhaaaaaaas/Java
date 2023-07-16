import java.util.ArrayList;
import java.util.Scanner;

public class WhileLoops {

	public static void main(String[] args) {

		String sentence = "Nicolas eh bla";
		Scanner scanner =  new Scanner(sentence);
		
		int a = 0;
		
		ArrayList<String> words = new ArrayList<>();
		
		while(scanner.hasNext()) {
			words.add(scanner.next());
		}
		
		System.out.println(words);
		
		//while(true) {
		//	System.out.println("a");
		//}
		
		//while(a < 10) {
		//	System.out.println("a: "+ a);
		//	a++;
		//}
		
		//do {
		//	System.out.println("a");
		//}while(true);
	}
}
