//User Defined Generic Class
public class GenericClass<T> {
	T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}
public class GenericClassTest {

	public static void main(String[] args) {
		GenericClass<Integer> ob = new GenericClass<Integer>();
		ob.setData(10);
		System.out.println(ob.getData());
		
		GenericClass<String> ob1 = new GenericClass<String>();
		ob1.setData("hello");
		System.out.println(ob1.getData());
	}

}
