import java.util.Scanner;

public class BankBalance {
    public static void main(String[] a) {
        Scanner scanner = new Scanner(System.in);
        final double INTEREST_RATE = 0.03;

        System.out.print("Enter initial bank balance > ");
        double balance = scanner.nextDouble();

        int choice = 1;
        int year = 1;

        while (choice == 1) {
       
            balance = balance + (balance * INTEREST_RATE);

            System.out.printf("After year %d at %.2f interest rate, balance is %.2f%n", year, INTEREST_RATE, balance);

            System.out.println("\nDo you want to see the balance at the end of another year?");
            System.out.print("Enter 1 for yes 2 for no >> ");
            choice = scanner.nextInt();

            year++;
        }
        scanner.close();
    }
}
