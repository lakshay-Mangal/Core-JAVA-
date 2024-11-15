import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class SimpleSwingForm {
    public static void main(String[] args) {
        JFrame frame= new JFrame("Login Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.setSize(3000,2000);
        frame.setLayout(null);

        JLabel userLabel= new JLabel("Username :");
        userLabel.setBounds(20,30,80,25);
        frame.add(userLabel);

        JTextField userText =  new JTextField();
        userText.setBounds(120, 30, 150, 25);
        frame.add(userText);

        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(20, 70, 80, 25);
        frame.add(passwordLabel);


        JPasswordField passwordText = new JPasswordField();
        passwordText.setBounds(120, 70, 150, 25);
        frame.add(passwordText);
        JButton submitButton= new JButton("Submit");
        submitButton.setBounds(90,120,100,30);
        frame.add(submitButton);

        
        //Add action button
        submitButton.addActionListener(new ActionListener (){
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = userText.getText();
                String password = new String(passwordText.getPassword());
                if("lakshay".equals(username) && "lakshay@123".equals(password)) {
                    JOptionPane.showMessageDialog(frame, "Login Successful");
                } else {
                    JOptionPane.showMessageDialog(frame, "Login Failed, Try again");
                }
            }
            
        });
        frame.setVisible(true);    


    }
}
