import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int elementNum = scanner.nextInt();
        int largestNum = elementNum;

        while (elementNum != 0) {
            if (elementNum >= largestNum) {
                largestNum = elementNum;
            }
            elementNum = scanner.nextInt();
        }

        System.out.println(largestNum);
        scanner.close();
    }
}