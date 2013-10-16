import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class model extends JFrame {

    ActionListener btnClick = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            MyButton.setSize(100, 100);
            MyButton.setText("Pressed!");

        }
    };

    public JTextField MyTextField;

    public JButton MyButton;

    public model() {
        super();
        this.setSize(800, 600);
        this.getContentPane().setLayout(null);
        this.setTitle("Chat client" + getWidth());

        JLabel MyLabel = new javax.swing.JLabel();
        MyLabel.setBounds(34, 49, 53, 18);
        MyLabel.setText("IP:");
        this.add(MyLabel, null);

        JTextField MyTextField = new javax.swing.JTextField();
        MyTextField.setBounds(96, 49, 160, 20);
        this.MyTextField = MyTextField;
        this.add(this.MyTextField, null);

        JButton MyButton = new javax.swing.JButton();
        MyButton.setBounds(103, 110, 71, 27);
        MyButton.setText("OK");
        this.MyButton = MyButton;
        this.add(this.MyButton, null);
        MyButton.addActionListener(btnClick);

    }

}
