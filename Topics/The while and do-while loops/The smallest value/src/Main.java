import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long m = scanner.nextLong();
        long n = 1;
        long factorial = 0;

        while (n <= m) {
            factorial++;
            n *= factorial;
        }
        System.out.println(factorial);
        scanner.close();
    }
}