import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener
{
    private static JLabel userLabel;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton button;
    private static JLabel Successful_Login_Message;


    public static void main(String[] args)
    {
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);
        JLabel userLabel = new JLabel("User");
        userLabel.setBounds(10, 20 ,80,25);
        panel.add(userLabel);

        userText = new JTextField(20);
        userText.setBounds(100, 20,165, 25);
        panel.add(userText);

        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);

        passwordText = new JPasswordField();
        passwordText.setBounds(100,50, 165, 25);
        panel.add(passwordText);

        button = new JButton("Login");
        button.setBounds(10, 80, 80, 25);
        button.addActionListener(new Main());
        panel.add(button);

        Successful_Login_Message = new JLabel("");
        Successful_Login_Message.setBounds(10, 110, 300, 25);
        panel.add(Successful_Login_Message);


        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent)
    {
        String user = userText.getText();
        String password = passwordText.getText();
//        System.out.println( user + ", " + password);

        if (user.equals("Muneeb") && password.equals("Dpdl_29217"))
        {
            Successful_Login_Message.setText(" Login Successful! ");
        }
        else
        {
            Successful_Login_Message.setText("Try Again!");
        }
    }

}
