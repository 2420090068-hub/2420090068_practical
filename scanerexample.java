package myproject;
import java.util.*;

public class scanerexample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();
        System.out.print("Enter HRA amount: ");
        double hra = sc.nextDouble();
        System.out.print("Enter DA amount: ");
        double da = sc.nextDouble();
        System.out.print("Enter PF amount: ");
        double pf = sc.nextDouble();
        double hraPercent = (hra / salary) * 100;
        double daPercent = (da / salary) * 100;
        double gross = salary + hra + da + 100 - pf; 
        System.out.println("\n--- Payroll Info ---");
        System.out.printf("HRA %%: %.2f%%\n", hraPercent);
        System.out.printf("DA %%: %.2f%%\n", daPercent);
        System.out.printf("Gross Salary: ₹%.2f\n", gross);
        if (gross > 20000 && pf > 1000) {
            System.out.println("Eligible for Loan: Yes");
        } else {
            System.out.println("Eligible for Loan: No");
        }
        sc.close();
    }
}