import java.util.Scanner;

public class BankAccountBalance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double balance = 100.00; // Starting balance
        double interestRate = 0.03; // 3% interest
        int year = 1;
        int choice;

        do {
            balance += balance * interestRate;
            System.out.printf("After year %d at %.2f interest rate, balance is $%.2f%n", year, interestRate, balance);

            System.out.println("\nDo you want to see the balance at the end of another year?");
            System.out.print("Enter 1 for yes or any other number for no >> ");
            choice = input.nextInt();
            year++;
        } while (choice == 1);
    }
}
