import java.util.HashMap;

public class Genericoss {

	public static void main(String[] args) {
		
		MyClass<Integer, Integer> obj = new MyClass<>(10, 2);
		MyClass<Double, Double> obj2 = new MyClass<>(20.0, 25.0);
		
		obj.showType();
		
		obj2.showType();
		
		NumericFunctions<Integer> iOb = new NumericFunctions<>(4);
		NumericFunctions<Double> dOb = new NumericFunctions<>(5.5);
		
		System.out.println(dOb.absEqual(iOb));
		
		System.out.println(iOb.square());

	}

}


class MyClass<T, V>{
	
	T ob;
	V ob2;
	
	HashMap<T, V> map = new HashMap<>();
	
	MyClass(T ob, V ob2){
		this.ob = ob;
		this.ob2 = ob2;
	}
	
	void showType() {
		System.out.println(ob.getClass().getName());
		System.out.println(ob2.getClass().getName());
	}
}

class NumericFunctions<T extends Number>{
	
	T num;
	
	NumericFunctions(T ob){
		this.num = ob;
	}
	
	double square() {
		return num.intValue() * num.doubleValue();
	}
	
	boolean absEqual(NumericFunctions<?> ob) {
		if(Math.abs(num.doubleValue()) == Math.abs(ob.num.doubleValue()))
			return true;
		return false;
	}
	
	
}
