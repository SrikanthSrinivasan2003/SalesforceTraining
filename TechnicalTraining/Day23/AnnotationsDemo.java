
@smartphone(version=7)
public class NokiaSeries {

}
public @interface SamsungPhone {

}
public @interface smartphone {
	String os() default "Android";
	int version();
}
public @interface waterproof {
String color();
}
