import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int arraySize = scanner.nextInt();
        scanner.nextLine();

        int[] arrayInts = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            arrayInts[i] = scanner.nextInt();
        }
        scanner.nextLine();

        int searchInt = scanner.nextInt();

        for (int i = 0; i < arraySize; i++) {
            if (arrayInts[i] == searchInt) {
                System.out.println("true");
                break;
            }

        }
        System.out.println("false");
        scanner.close();
    }
}