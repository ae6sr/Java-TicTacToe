import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int checkZero = scanner.nextInt();
        int counter = 0;

        while (checkZero != 0 && scanner.hasNext()) {
            counter++;
            checkZero = scanner.nextInt();
        }

        System.out.println(counter);
        scanner.close();
    }
}