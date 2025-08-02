package OOPS;
import java.util.*;

public class Scannerex {
	public static void main(String args[]) {
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int val=sc.nextInt();
		
		System.out.println("Enter a String");
		String value=sc.next();
		
		System.out.println("Enter a decimal value");
		float f=sc.nextFloat();
		
		System.out.println("Enter a long number");
		long l=sc.nextLong();
		
		System.out.println("Integer "+val);
		System.out.println("String "+value);
		System.out.println("Float value "+f);
		System.out.println("Long value "+l);
	}
}