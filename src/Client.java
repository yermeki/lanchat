@SuppressWarnings({"UnusedDeclaration"})
public class Client {
    public static void main(String[] ar) {

        model myForm = new model();
        myForm.setVisible(true);

        String txt = myForm.MyTextField.getText();
        System.out.println(txt);

        Controller myController = new Controller("127.0.0.1", "Hello Server!");


    }
}