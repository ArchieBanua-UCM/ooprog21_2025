import java.util.Scanner;

public class DebugSix1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int days;
        double money = 0.01;

        System.out.print("Enter number of days >> ");
        days = keyboard.nextInt();

        for (int day = 1; day <= days; day++) {
            System.out.printf("After day %d you have $%.2f%n", day, money);
            money *= 2;
        }
    }
}
