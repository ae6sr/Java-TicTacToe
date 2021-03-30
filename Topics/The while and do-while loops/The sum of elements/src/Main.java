import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int checkZero = scanner.nextInt();
        int sumTotal = 0;

        do {
            sumTotal += checkZero;
            if (scanner.hasNextInt()) {
                checkZero = scanner.nextInt();
            }
        } while (checkZero != 0);

        System.out.println(sumTotal);
        scanner.close();
    }
}