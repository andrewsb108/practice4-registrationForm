package controller;

import view.View;

import java.util.Scanner;

import static controller.RegexContainer.*;
import static view.TextConstants.FIRST_NAME;
import static view.TextConstants.LOGIN_DATA;

/**
 * @author Andriy Barsuk
 */
public class InputNote {
    private View view;
    private Scanner sc;

    private String firstName;
    private String login;

    InputNote(View view, Scanner sc) {
        this.view = view;
        this.sc = sc;
    }

    public void inputNote() {
        UtilityController utilityController = new UtilityController(view, sc);
        String string = (String.valueOf(View.bundle.getLocale()).equals("ua"))
                ? REGEX_NAME_UKR : REGEX_NAME_LAT;

        this.firstName = utilityController.inputStringValueFromScanner(FIRST_NAME, string);

        this.login = utilityController.inputStringValueFromScanner(LOGIN_DATA, REGEX_LOGIN);
    }
}
