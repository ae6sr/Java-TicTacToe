import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int limitNum = scanner.nextInt();
        int i = 1;
        int result = 1;
        int checkNum;

        do {
            result = i * i;
            System.out.println(result);
            i++;
            checkNum = i * i;
        } while (checkNum <= limitNum);
        scanner.close();
    }
}