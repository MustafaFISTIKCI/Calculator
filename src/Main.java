import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener {
    public JTextField firstNumber, secondNumber;
    public JButton buttonPlus, buttonMinus, buttonMultiply, buttonDivide;
    public JLabel result;
    
    public Main() {

        setLocationRelativeTo(null);
        setTitle("Calculator");
        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        ImageIcon logo = new ImageIcon("calculator.png");
        setIconImage(logo.getImage());
        getContentPane().setBackground(Color.BLACK);


        firstNumber = new JTextField();
        firstNumber.setBounds(20, 20, 100, 30);
        add(firstNumber);

        secondNumber = new JTextField();
        secondNumber.setBounds(20, 60, 100, 30);
        add(secondNumber);

        result = new JLabel();
        result.setBounds(20, 100, 100, 30);
        add(result);

        buttonPlus = new JButton();
        buttonPlus.setBounds(20, 140, 50, 50);
        add(buttonPlus);
        buttonPlus.setFocusable(false);
        buttonPlus.setBackground(Color.ORANGE);
        ImageIcon plus = new ImageIcon("plus.png");
        buttonPlus.setIcon(plus);

        buttonMinus = new JButton();
        buttonMinus.setBounds(80, 140, 50, 50);
        add(buttonMinus);
        buttonMinus.setFocusable(false);
        buttonMinus.setBackground(Color.ORANGE);
        ImageIcon minus = new ImageIcon("minus.png");
        buttonMinus.setIcon(minus);

        buttonMultiply = new JButton();
        buttonMultiply.setBounds(140, 140, 50, 50);
        add(buttonMultiply);
        buttonMultiply.setFocusable(false);
        buttonMultiply.setBackground(Color.ORANGE);
        ImageIcon multiply = new ImageIcon("multiply.png");
        buttonMultiply.setIcon(multiply);

        buttonDivide = new JButton();
        buttonDivide.setBounds(200, 140, 50, 50);
        add(buttonDivide);
        buttonDivide.setFocusable(false);
        buttonDivide.setBackground(Color.ORANGE);
        ImageIcon divide = new ImageIcon("divide.png");
        buttonDivide.setIcon(divide);

        buttonPlus.addActionListener(this);
        buttonMinus.addActionListener(this);
        buttonMultiply.addActionListener(this);
        buttonDivide.addActionListener(this);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double num1 = Double.parseDouble(firstNumber.getText());
            double num2 = Double.parseDouble(secondNumber.getText());
            double result = 0;
            if (e.getSource() == buttonPlus) {
                result = num1 + num2;
            } else if (e.getSource() == buttonMinus) {
                result = num1 - num2;
            } else if (e.getSource() == buttonMultiply) {
                result = num1 * num2;
            } else if (e.getSource() == buttonDivide) {
                result = num1 / num2;
            }
            this.result.setForeground(Color.WHITE);
            this.result.setText("Result: " + result);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Invalid input");
        }
    }
    public static void main(String[] args) {
        new Main();
    }
}