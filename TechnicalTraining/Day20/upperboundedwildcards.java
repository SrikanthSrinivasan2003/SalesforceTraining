import java.util.ArrayList;

public class UpperBoundedWildCard {
	//Parameter ArrayList(<?>) is List of any subclass object of Number
		public static Double sumOfList(ArrayList<? extends Number> al) // any subclass of Number class
		{
			double sum = 0.0;
			for (Number n : al) {
				sum = sum + n.doubleValue();
			}
			return sum;
		}
	}
import java.util.ArrayList;

public class UpperBoundedWildcardDemo {
	public static void main(String[] args) {
		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(10);
		intList.add(20);
		//passing Integer List 
		System.out.println("sum = " + UpperBoundedWildCard.sumOfList(intList));

		ArrayList<Double> doubleList = new ArrayList<Double>();
		doubleList.add(10.0);
		doubleList.add(20.0);
		doubleList.add(30.0);
		//passing Double List
		System.out.println("sum = " + UpperBoundedWildCard.sumOfList(doubleList));
		
		/*
		 * ArrayList<String> strList=new ArrayList<String>(); strList.add("Arun");
		 * strList.add("Ajay"); strList.add("Ragul"); //passing String List
		 * System.out.println("sum = " + UpperBoundedWildCard.sumOfList(strList));
		 */
		}
}
