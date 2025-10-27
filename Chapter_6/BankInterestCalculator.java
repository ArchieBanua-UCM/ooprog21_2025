import java.util.Scanner;

public class BankInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter initial bank balance > ");
        double initialBalance = scanner.nextDouble();

        double[] interestRates = {0.02, 0.03, 0.04, 0.05};

        for (double rate : interestRates) {
            double balance = initialBalance;
            System.out.printf("\nWith an initial balance of $%.2f at an interest rate of %.2f\n", initialBalance, rate);

            for (int year = 1; year <= 4; year++) {
                balance += balance * rate;
                System.out.printf("After year %d balance is $%.2f\n", year, balance);
            }
        }

        scanner.close();
    }
}
