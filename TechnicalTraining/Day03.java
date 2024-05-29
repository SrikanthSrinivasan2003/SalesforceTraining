Day3
Q1)
public class FirstProgram {
	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.print("Hi ");
		System.out.println("Haii");
	}
}


Q2)
public class DataTypesDemo {
	public static void main(String[] args) {
		int value1=9/2;
		float value2=101/61;
		double value3 = 10d/6d;
		float value4= 5/2.5f;
		System.out.println("value1 "+value1);
		System.out.println("value2 "+value2);
		System.out.println("value3 "+value3);
		System.out.println("value4 "+value4);
	}
}



Q3)
public class TypeCastingDemo {
	public static void main(String[] args) {
		//implicit type casting /widening
		byte b=10;
		int i=b;
		System.out.println(i);
		
		float f=22.3f;
		double d=f;
		System.out.println(d);
		
		//explicit type casting / narrowing
		float f1=34.56f;
		int r=(int)f1;
		System.out.println(r);	
	}
}
