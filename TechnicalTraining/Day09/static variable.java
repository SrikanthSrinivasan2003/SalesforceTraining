public class employee {
	private String name;
	private int id;
	static String companyName = "DreamWork";
	employee(String name,int id)
	{
		this.name = name;
		this.id = id;
  }
	@Override
	public String toString() {
		return "employee [Name=" + name + ", Id=" + id + ", Company = "+ companyName +"]";
	}
}

public class employeeDemo {
	public static void main(String[] args) {
		employee emp1 = new employee("Srikanth",91);
		System.out.println(emp1);
		employee emp2 = new employee("Sam",92);
		System.out.println(emp2);
		employee.companyName = "MadSolutions";//direct access of static variable
		employee emp3 = new employee("MSD",93);
		System.out.println(emp3);	
	}
}
