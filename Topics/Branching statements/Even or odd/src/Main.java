import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        do {
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            } else if (num % 2 == 0) {
                System.out.println("even");
            } else if (num % 2 != 0) {
                System.out.println("odd");
            }
        } while (scanner.hasNext());
    }
}