package May26_MVC;

/**
 * Created by senafunakubo on 2017-06-01.
 */
public class Main {
    public static void main(String[] args) {
        TextInputModel theModel = new TextInputModel();
        TextInput theView = new TextInput();
        TextInputController theController = new TextInputController(theView, theModel);
        theView.setVisible(true);
    }
}
