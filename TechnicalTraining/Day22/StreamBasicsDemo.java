import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamBasics {

	public static void main(String[] args) {
		//List<Integer> l1=new LinkedList<Integer>();
		Stream<Integer> stream=Stream.of(10,20,30,40,50);//stream
		System.out.println(stream.count());
		
		Integer[] values=new Integer[] { 10, 20, 30, 13, 10, 11, 12, 13 };//array
		stream=Arrays.stream(values);
System.out.println(Arrays.toString(values));
		//for(m=0;m<n;m++)
		//num=m*m
		//sop(num)
		stream=stream.map(m->m*m);
		stream.forEach(System.out::println);//method reference
		
		// limit 
				System.out.println("First 2 elements are : ");
				Arrays.stream(values).limit(2).forEach(System.out::println);

				// skip 
				System.out.println("Elements excepts first 4 : ");
				Arrays.stream(values).skip(4).forEach(System.out::println);

				// distinct
// distinct 
				System.out.println("Distinct Elements are : ");
				Arrays.stream(values).distinct().forEach(System.out::println);
				
				
				List<String> words = Arrays.asList("Hello", "Stream", "Learning");
				//words.add("In Java"); Immutable list
				
				// creating a stream from a List
				Stream<String> stream1 = words.stream();

				// map
				System.out.println("Strings in uppercase : ");
				List<String> s1 = stream1.map(str -> str.toUpperCase()).collect(Collectors.toList());
System.out.println(s1);
				
				stream1 = words.stream();
				stream1.map(str->str.toLowerCase()).forEach(System.out::println);
				System.out.println(words);//list
	}

}
