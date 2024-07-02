public class GenericConstrutor {
	private double v;
	public<T extends Number> GenericConstrutor(T t){
		v = t.doubleValue();
	}
	void show() {
		System.out.println("The Double value of the given number is: "+v);
	}
}
public class GenericConstructorDemo {

	public static void main(String[] args) {
		GenericConstrutor ob = new GenericConstrutor(10);
		GenericConstrutor obj1 = new GenericConstrutor(654F);
		ob.show();
		obj1.show();

	}

}
