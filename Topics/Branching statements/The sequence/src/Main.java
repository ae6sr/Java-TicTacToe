import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numElements = scanner.nextInt();
        int counter = 0;

        for (int i = 0; i < numElements + 1; i++) {
            for (int j = 0; j < i; j++) {
                if (counter == numElements) {
                    break;
                }
                System.out.print(i + " ");
                counter++;

            }
        }

        scanner.close();
    }
}