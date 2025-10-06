import java.util.Scanner;

 public class Payroll {
     public static void main(String [] a) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many hours did you work this week? ");
        int hoursWorked = input.nextInt();

        System.out.print("Whats youre regular pay rate? ");
        double payRate = input.nextDouble();
    
        Employee emp = new Employee(1, payRate);
        hoursWorked = 45; 

        double regularPay = emp.calculateRegularPay(hoursWorked);
        double overtimePay = emp.calculateOvertimePay(hoursWorked);

        System.out.println("Regular pay is " + regularPay);
        System.out.println("Overtime pay is " + overtimePay);
         }
 }