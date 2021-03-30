import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numberOfElements = scanner.nextInt();
        int[] elements = new int[numberOfElements];
        int i = 0;

        while (i < numberOfElements) {
            elements[i] = scanner.nextInt();
            i++;
        }

        int maxElement = 0;

        for (int j = 0; j < numberOfElements; j++) {
            if (elements[j] >= maxElement && elements[j] % 4 == 0) {
                maxElement = elements[j];
            }
        }

        System.out.println(maxElement);
        scanner.close();
    }
}