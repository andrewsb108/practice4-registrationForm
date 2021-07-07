import controller.Controller;
import model.Model;
import view.View;
/**
 * Basis class of the program for launching application
 * @author Andrii Barsuk
 * @see Controller
 */
public class Main {
    public static void main(String[] args) {
    Controller controller = new Controller(new Model(), new View());

    controller.processUser();
    }
}
