import java.awt.*;
import java.awt.event.*;

public class App extends Frame implements ActionListener {

    private TextField tf;

    App()
    {
        tf = new TextField();
        tf.setBounds(60, 50, 170, 20);
        Button b = new Button("click me");
        b.setBounds(100, 120, 80, 30);

        b.addActionListener(this);

        add(b);
        add(tf);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        tf.setText("Welcome to java");
    }

    public static void main(String[] args) throws Exception {
        App awt_obj = new App();
    }

}
