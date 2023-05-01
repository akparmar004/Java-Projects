import javax.swing.*;
import java.awt.*;

public class MyWindow extends JFrame{

    private JLabel heading;
    Font font = new Font("",Font.BOLD,30);

    private JPanel panel;
    private JLabel name,password;

    private JTextField nameTF;
    private JPasswordField passwordField;
    private JButton button1,button2;

    public MyWindow(){
        super.setTitle("Parmar & Sons");
        super.setSize(500,500);
        super.setLocation(200,100);
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.createGUI();

        setVisible(true);

    }

    public void createGUI(){

        ///////this method create our GUI

        this.setLayout(new BorderLayout());

        heading = new JLabel("Join our Group");
        heading.setFont(font);
        heading.setHorizontalAlignment(JLabel.CENTER);



        this.add(heading,BorderLayout.NORTH);

        ////////////working with JPanel

        panel = new JPanel();
        // setting layout of our panel..
        panel.setLayout(new GridLayout(3,2,20,20));

        name = new JLabel("Enter Name : ");
        name.setFont(font);

        password = new JLabel("Enter Password : ");
        password.setFont(font);

        nameTF = new JTextField();
        nameTF.setFont(font);
        nameTF.setBackground(Color.ORANGE);
        nameTF.setPreferredSize(new Dimension(200, 30));

        passwordField = new JPasswordField();
        passwordField.setFont(font);
        passwordField.setPreferredSize(new Dimension(200, 30));

        button1 = new JButton("Submit");
        button1.setFont(font);

        button2 = new JButton("Reset");
        button2.setFont(font);

        panel.add(name);
        panel.add(nameTF);
        panel.add(password);
        panel.add(passwordField);
        panel.add(button1);
        panel.add(button1);
        panel.add(button2);

        this.add(panel,BorderLayout.CENTER);
    }
}
