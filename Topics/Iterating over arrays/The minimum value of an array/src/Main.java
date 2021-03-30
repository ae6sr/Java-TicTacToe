import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        // Input
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] numArray = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            numArray[i] = scanner.nextInt();
        }

        scanner.close();
        // End input

        // Processing and output
        int minArray = numArray[0];
        for (int i = 0; i < arraySize; i++) {
            if (numArray[i] <= minArray) {
                minArray = numArray[i];
            }
        }

        System.out.println(minArray);
    }
}