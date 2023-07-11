import java.util.*;

public class LinkListExplica {

	public static void main(String[] args) {
		LinkedList<String> linky = new LinkedList<String>();
		
		linky.add("Nicolas");
		linky.add("Anabel");
		linky.add("Anitta");
		
		//linky.remove();
		
		System.out.println(linky.get(0));
		
		Iterator it = linky.iterator();
		while(it.hasNext()) {
			if(it.next() == "Anabel") {
				System.out.println("Achei anabel");
			}
		}

	}

}
