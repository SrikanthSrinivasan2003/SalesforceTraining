public class MethodOverloading {
	public static int addition(int a, int b) {
		return a+b;
	}
	public static int addition(int a, int b,int c) {
		return a+b+c;
	}
	public static float addition(float a, float b,float c) {
		return a+b+c;
	}
}
public class MethodOverloadingDemo {
	public static void main(String[] args) {
		System.out.println(MethodOverloading.addition(10, 20));
		System.out.println(MethodOverloading.addition(12, 20,10));
		System.out.println(MethodOverloading.addition(42f, 20f,10f));
	}
}
