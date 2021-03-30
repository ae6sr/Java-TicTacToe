import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumNumber = 0;
        int nextInt = scanner.nextInt();

        do {
            sumNumber += nextInt;

            if (sumNumber >= 1000) {
                sumNumber -= 1000;
                break;
            }

            nextInt = scanner.nextInt();

            if (nextInt == 0) {
                break;
            }

        } while (scanner.hasNextInt());

        System.out.println(sumNumber);

        scanner.close();
    }
}