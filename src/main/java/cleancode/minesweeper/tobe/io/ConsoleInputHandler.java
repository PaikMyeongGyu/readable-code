package cleancode.minesweeper.tobe.io;

import java.util.Scanner;

public class ConsoleInputHandler implements InputHandler {
    public static final Scanner SCANNER = new Scanner(System.in);

    public String getUserInput() {
        return SCANNER.nextLine();
    }
}
