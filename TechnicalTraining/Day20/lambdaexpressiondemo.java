@FunctionalInterface
public interface Statement {
	public String show();
}
public class LambdaWithoutPara {
		public static void main(String[] args) {
			Statement s = ()->{return "Hello world";};
			System.out.println(s.show());
		}
	}
