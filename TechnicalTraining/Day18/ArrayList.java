
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		//hetero-genous list
		List list1 = new ArrayList();
		System.out.println("Size is : "+list1.size());
		System.out.println("Is Empty? " + list1.isEmpty());
		list1.add(10);
		list1.add(20);
		list1.add(true);
		list1.add(false);
		list1.add("Hello");
		list1.add(56.78);
		list1.add('A');
		list1.add(6,"Hii");
		
		System.out.println("The list is :"+list1);
		System.out.println("The element is present or not?  :"+list1.contains(20));
		System.out.println("Remove the Element :"+list1.remove(true));//we should give index
		System.out.println("Size is : "+list1.size());
		Collections.reverse(list1);
		System.out.println("The list is :"+list1);
		
		//homo-genous list
		//generic
		List <String> names = new  ArrayList<String>();
		names.add("Srikanth");
		names.add("Ben 10");
		names.add("Luffy");
		System.out.println("The Names Are:"+names);
		Collections.reverse(names);
		System.out.println("The Reversed Names Are:"+names);
		
		
		Iterator<String> i = names.iterator();
		while(i.hasNext()) {
			String name = i.next();
			System.out.println(name);
			if (name.equals("Ben 10"))
				i.remove();
		}
		
		System.out.println("The names of list is :"+names);
		System.out.println("--------------Traversing the list reverse--------------");
		
	}

}
