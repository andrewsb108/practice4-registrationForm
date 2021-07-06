package controller;

import view.View;

import java.util.Scanner;

/**
 * @author Andrii Barsuk
 */
public class UtilityController {
    private Scanner scanner;
    private View view;

    public UtilityController(View view, Scanner scanner) {
        this.scanner = scanner;
        this.view = view;
    }

    String inputStringValueFromScanner(String message, String regex) {
        String result;
        view.printStringInput(message);
        while (!(scanner.hasNext() && (result = scanner.next()).matches(regex))) {
            view.printWrongStringInput(message);
        }
        return result;
    }
}
