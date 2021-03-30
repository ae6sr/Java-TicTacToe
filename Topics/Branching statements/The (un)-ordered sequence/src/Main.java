import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int newNumber;
        int midNumber = 0;
        int oldNumber = 0;
        boolean ascending = false;
        boolean descending = false;
        int count = 0;

        while (scanner.hasNextInt()) {
            newNumber = scanner.nextInt();

            if (newNumber == 0 && count < 3) {
                ascending = true;
                descending = false;
                break;
            }

            if (newNumber == 0 && midNumber != 0) {
                break;
            }

            if (oldNumber == 0) {
                oldNumber = midNumber;
                midNumber = newNumber;
                count++;
                continue;
            }

            if (oldNumber < midNumber && midNumber < newNumber) {
                ascending = true;
            } else if (newNumber < midNumber || midNumber < oldNumber) {
                descending = true;
            } else if (newNumber == midNumber) {
                oldNumber = midNumber;
                midNumber = newNumber;
                count++;
                continue;
            }

            oldNumber = midNumber;
            midNumber = newNumber;
            count++;
        }

        System.out.println(ascending ^ descending);
        scanner.close();
    }
}