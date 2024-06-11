public class MyClass {
	private int Section;//non-static or instance variable
	private static int srNo;//static 
	

	//static block
	static {
		System.out.println("-----Within Static Block-----");
		srNo++;
	}
	MyClass(){
		System.out.println("----Within default constructor----");
		srNo++;
		Section++;
	}
	@Override
	public String toString() {
		return "employee [SerialNo=" + srNo + ", Section=" + Section +" ]";
	}
	static void display() {
		//inside a static method you cannot access non static variable
		//System.out.println("Section: "+Section);
		System.out.println("SerialNo: "+srNo);
	}
}
public class MyClassDemo {

	public static void main(String[] args) {
		MyClass obj1 = new MyClass();
		System.out.println(obj1);
		MyClass.display();
	}

}
