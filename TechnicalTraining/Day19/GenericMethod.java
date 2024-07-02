public class GenericMethod {
	public <T>void displayArrayElements(T elements[]) {
		for(T element:elements) {
				System.out.println("The Element is: "+element);
		}
	}
}
public class GenericMethodTest {

	public static void main(String[] args) {
		GenericMethod obj = new GenericMethod();
		Integer[] intarray = {10,20,30,40,50};
		String[] str1 = {"Java","Python","DotNet"};
		obj.displayArrayElements(intarray);
		obj.displayArrayElements(str1);

	}

}
