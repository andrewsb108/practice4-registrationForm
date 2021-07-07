package view;

import java.util.Locale;
import java.util.ResourceBundle;

import static view.TextConstants.INPUT_STRING_DATA;
import static view.TextConstants.WRONG_INPUT_DATA;

/**
 * View created for displaying all output info
 * @author Andrii Barsuk
 */
public class View {
    static String MESSAGE_BUNDLE_NAME = "message";
    public static final ResourceBundle bundle = ResourceBundle.getBundle(
            MESSAGE_BUNDLE_NAME,
//            new Locale("ua", "UA"));
          new Locale("en"));

    /**
     * Method serving for output data from class Controller and UtilityController
     * @param message
     */
    public void printMessage(String message) {
        System.out.println(message);
    }

    /**
     * Method serving for concatenation output data
     * @param message
     * @return concat text
     */
    public String concatenationString(String ... message) {
        StringBuilder concatString = new StringBuilder();
        for (String value : message) {
           concatString = concatString.append(value);
        }
        return new String(concatString);
    }

    public void printStringInput(String message) {
        printMessage(concatenationString(bundle.getString(INPUT_STRING_DATA),
                bundle.getString(message)));
    }

    public void printWrongStringInput(String message) {
        printMessage(concatenationString(bundle.getString(WRONG_INPUT_DATA),
                bundle.getString(INPUT_STRING_DATA), bundle.getString(message)));
    }

}
