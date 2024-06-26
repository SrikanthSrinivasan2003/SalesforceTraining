import java.util.Scanner;

public class AgeValidator {
	static boolean  isAgeValid(int age){
		return age>=18;
	}
	static void validateAge(int age) throws InvalidAgeException 
	{
		if(!isAgeValid(age))
			throw new InvalidAgeException("Invalid age cannot vote");
	}

	public static void main(String[] args) {
		int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        while (!sc.hasNextInt()) 
        {
            System.out.println("Invalid input. Please enter a valid integer age:");
            sc.next(); // Discard non-integer input
        }
        age = sc.nextInt();//12

        try {
            validateAge(age);
            System.out.println("Welcome to vote!");
        }
catch (InvalidAgeException e) {
            System.err.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}
public class InvalidAgeException extends Exception {
	InvalidAgeException(){
		super("Invalid Age");
	}
	InvalidAgeException(String message){
		super(message);
	}
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class checkedException {
	/**
	 * Reads a line of text from the console.
	 *
	 * @return the string entered by the user
	 * @throws IOException if an I/O error occurs while reading the input
	 */
	static String acceptText() throws IOException  {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			System.out.println("Enter the string: ");
			String str = br.readLine();
			//br.close();
			return str;
		}
	}

	public static void main(String[] args) {

		try {
			String str = acceptText();
			System.out.println("Your string is " + str);
		} catch (IOException e) {
			System.err.println("An error occurred while reading input: " + e.getMessage());
		} catch (NullPointerException e) {
			System.err.println("NullPointerException occurred: " + e.getMessage());
		}
	}

}
