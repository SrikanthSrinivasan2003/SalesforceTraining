@FunctionalInterface
public interface Cube {
	int calculate(int a);
}
@FunctionalInterface
public interface isOdd {
	public boolean check(int a);
}
@FunctionalInterface
public interface Message {
	public void greet(String name);

}
public class LambdaWithParameter {

	public static void main(String[] args) {
		Cube c = (a)->{return a*a*a;};
		System.out.println(c.calculate(2));
		
		isOdd b = (a)->{return a%2!=0?true:false;};
		System.out.println(b.check(3));
		
		Message m = (name)->{ System.out.println("Hello "+name);};
		m.greet("Sam");
	}

}
