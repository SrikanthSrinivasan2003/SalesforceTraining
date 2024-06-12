public class FinalVariable {
	final int X=100;//if you use final for declaration  you should initialize then and there
	final static int Y;//blank final static is not possible
	final static int Z = 200;
	void change() {
		//X=30;//re-assigning not possible
		//Z = 203;//re-assigning not possible
	}
	static {
		Y = 200;//re-assigning is possible because static block will execute first
	}

}
public class FinalMethodDemo extends FinalMethod{

	//cannot override the final method
	/*void show() {
		System.out.println(a);
	}*/

}
public class FinalMethod {
	FinalMethod(){
		System.out.println("I am from Default Constructor");
	}
	final int a=10;
	final void show() {
		System.out.println(a);
	}
}
final class Example{//base
	void show() {
	System.out.println("Final class cannot be inherited");
	}
}
//class Example1 extends Example{//derived
	
//}
public class FinalMDemo {

	public static void main(String[] args) {
		Example e = new Example();
		e.show();
		
		FinalMethod f = new FinalMethod();
		f.show();
	}

}
