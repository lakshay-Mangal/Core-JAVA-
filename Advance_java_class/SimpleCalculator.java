import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class SimpleCalculator {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setLayout(null);

        JLabel firstNumLabel = new JLabel("First Number:");
        firstNumLabel.setBounds(20, 30, 100, 25);
        frame.add(firstNumLabel);

        JTextField firstNum = new JTextField();
        firstNum.setBounds(120, 30, 150, 25);
        frame.add(firstNum);

        JLabel secondNumLabel = new JLabel("Second Number:");
        secondNumLabel.setBounds(20, 70, 100, 25);
        frame.add(secondNumLabel);

        JTextField secondNum = new JTextField();
        secondNum.setBounds(120, 70, 150, 25);
        frame.add(secondNum);

        JButton addButton = new JButton("+");
        addButton.setBounds(20, 120, 50, 30);
        frame.add(addButton);

        JButton subtractButton = new JButton("-");
        subtractButton.setBounds(80, 120, 50, 30);
        frame.add(subtractButton);

        JButton multiplyButton = new JButton("*");
        multiplyButton.setBounds(140, 120, 50, 30);
        frame.add(multiplyButton);

        JButton divideButton = new JButton("/");
        divideButton.setBounds(200, 120, 50, 30);
        frame.add(divideButton);

        JLabel resultLabel = new JLabel("Result:");
        resultLabel.setBounds(20, 170, 100, 25);
        frame.add(resultLabel);

        JTextField resultField = new JTextField();
        resultField.setBounds(120, 170, 150, 25);
        resultField.setEditable(false);
        frame.add(resultField);

        resultField.addActionListener(new ActionListener (){
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = firstNum.getText();
                int x = Integer.parseInt(username);
                String num2 = secondNum.getText();
                int y = Integer.parseInt(num2);

                int sum=x+y;

                JOptionPane.showMessageDialog(frame, sum);

               
            }
            
        });
        
        frame.setVisible(true);
    }
}

       
