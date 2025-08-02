package OOPS;
import java.util.*;

public class Practise {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Name : ");
		String n=sc.nextLine();
		
		System.out.println("Enter Id :");
		int l=sc.nextInt();
		
		System.out.println("Enter Department : ");
		String d=sc.next();
		
		System.out.println("Enter Experience : ");
		float e=sc.nextFloat();
		
		System.out.println("Enter Salary : ");
		double s=sc.nextDouble();
		
		System.out.println("Full Time or Not : ");
		boolean b=sc.nextBoolean();
		
		System.out.println("Enter Contact Number : ");
		long num=sc.nextLong();
		
		System.out.println("");
		
		System.out.println("The employee details are : ");
		System.out.println("Id : "+l);
		System.out.println("Name : "+n);
		System.out.println("Department : "+d);
		System.out.println("Experience : "+e);
		System.out.println("Salary : "+s);
		System.out.println("Full Time or not : "+b);
		System.out.println("Contact number : "+num);
	}
}
