public class Main {

	public static void main(String[] args) {
		
		Integer[] intArray = {1, 2, 3, 4, 5};
		Double[] doubleArray = {5.5, 4.4, 3.3, 2.2, 1.1};
		Character[] charArray = {'H', 'E', 'L', 'L', 'O'};
		String[] stringArray = {"B", "Y", "E"};
		
		//displayArray(intArray);
		//displayArray(doubleArray);
		//displayArray(charArray);
		//displayArray(stringArray);
		
		//System.out.println(getFirst(intArray));
		//System.out.println(getFirst(doubleArray));
		//System.out.println(getFirst(charArray));
		//System.out.println(getFirst(stringArray));
		
		MyGenericClass <Integer> myInt = new MyGenericClass<>(1);
		MyGenericClass <Double> myDouble = new MyGenericClass<>(3.14);
		MyGenericClass <Character> myChar = new MyGenericClass<>('@');
		MyGenericClass <String> myString = new MyGenericClass<>("Hello");
		
		System.out.println(myInt.getValue());
		System.out.println(myDouble.getValue());
		System.out.println(myChar.getValue());
		System.out.println(myString.getValue());
		

	}
	
	public static <Thing> void displayArray(Thing[] array) { //metodo generico "T" ou "Thing"
		for(Thing x : array) {
			System.out.print(x+" ");
		}
		System.out.println();
	}
	
	public static <Thing> Thing getFirst(Thing[] array) {
		return array[0];
	}
	
	/*public static void displayArray(Double[] array) {
		for(Double x : array) {
			System.out.print(x+" ");
		}
		System.out.println();
	}
	
	public static void displayArray(Character[] array) {
		for(Character x : array) {
			System.out.print(x+" ");
		}
		System.out.println();
	}
	
	public static void displayArray(String[] array) {
		for(String x : array) {
			System.out.print(x+" ");
		}
		System.out.println();
	}*/

}


public class MyGenericClass <Thing extends Number>{ // esse extends number faz com que só aceite tipos q sao numeros

	Thing x;
	
	MyGenericClass(Thing x){
		this.x = x;
	}
	
	public Thing getValue() {
		return x;
	}
}
