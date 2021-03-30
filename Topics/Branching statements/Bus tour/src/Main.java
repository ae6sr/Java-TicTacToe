import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int busHeight = scanner.nextInt();
        int numBridges = scanner.nextInt();

        for (int i = 0; i < numBridges; i++) {
            int bridgeHeight = scanner.nextInt();
            if (busHeight >= bridgeHeight) {
                System.out.println("Will crash on bridge " + (i + 1));
                break;
            } else if (i == numBridges - 1) {
                System.out.println("Will not crash");
            }
        }
    }
}