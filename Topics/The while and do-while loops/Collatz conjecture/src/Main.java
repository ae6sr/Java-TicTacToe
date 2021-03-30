import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int startNum = scanner.nextInt();

        System.out.print(startNum + " ");

        while (startNum != 1) {
            if (startNum % 2 == 0) {
                startNum = startNum / 2;
                System.out.print(startNum + " ");
            } else {
                startNum = startNum * 3 + 1;
                System.out.print(startNum + " ");
            }
        }
        scanner.close();
    }
}