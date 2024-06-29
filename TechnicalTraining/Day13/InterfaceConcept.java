@FunctionalInterface
public interface GreetInterface
{
	public String greet();
}
public class GreetClass implements GreetInterface
{
	public String greet()
	{
		return "Hello World";
	}
}
public class Demo 
{
	public static void main(String[] args)
	{
	GreetClass o= new GreetClass();
	System.out.println(o.greet());
	}
}
