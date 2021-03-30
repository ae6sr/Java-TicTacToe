package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        char[] gameState = new char[9];
        System.out.println("Enter cells: ");
        String askUser = scanner.next();
        for (int i = 0; i < 9; i++) {
            gameState[i] = askUser.charAt(i);
        }

        System.out.println("---------");
        System.out.println("| "+ gameState[0] + " " + gameState[1] + " " + gameState[2] + " |");
        System.out.println("| "+ gameState[3] + " " + gameState[4] + " " + gameState[5] + " |");
        System.out.println("| "+ gameState[6] + " " + gameState[7] + " " + gameState[8] + " |");
        System.out.println("---------");
    }
}
