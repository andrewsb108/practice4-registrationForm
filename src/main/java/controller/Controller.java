package controller;

import model.Model;
import view.View;

import java.util.Scanner;

/**
 * class Controller gets data from console line and validates it.
 * Controller uses Model for business logic
 * and View in order to output validation info
 * @author Andrii Barsuk
 * @see Model
 * @see View
 */
public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        Scanner sc = new Scanner(System.in);
        InputNote inputNoteNotebook = new InputNote(view, sc);
        inputNoteNotebook.inputNote();
    }
}
