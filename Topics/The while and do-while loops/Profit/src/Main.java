import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double initialDeposit = scanner.nextDouble();
        double interest = scanner.nextDouble() / 100;
        double targetBalance = scanner.nextDouble();
        int countYears = 0;

        while (initialDeposit < targetBalance) {
            countYears++;
            double annualIncrease = initialDeposit * interest;
            initialDeposit += annualIncrease;
        }

        System.out.println(countYears);
        scanner.close();
    }
}