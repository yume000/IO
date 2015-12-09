import java.util.*;
import java.lang.*;
import static java.lang.System.out;
public class IOByScanner {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		//string
		out.print("Please enter string>>");
		String str = scanner.nextLine();
		System.out.println("The type is >>" + str.getClass().getName());
		//int
		out.print("Please enter integer>>");
		Integer i = scanner.nextInt();
		System.out.println("The type is >>" + i.getClass().getName());
		//long
		out.print("Please enter long>>");
		Long l = scanner.nextLong();
		System.out.println("The type is >>" + l.getClass().getName());
		//float
		out.print("Please enter float>>");
		Float f = scanner.nextFloat();
		System.out.println("The type is >>" + f.getClass().getName());
		//double
		out.print("Please enter float>>");
		Double d = scanner.nextDouble();
		System.out.println("The type is >>" + d.getClass().getName());
		//boolean
		out.print("Please enter boolean>>");
		Boolean b = scanner.nextBoolean();
		System.out.println("The type is >>" + b.getClass().getName());
	}
}