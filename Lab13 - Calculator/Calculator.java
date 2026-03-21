import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {

    JTextField t1, t2, result;
    JButton add, sub, mul, div, clear;

    Calculator() {
        setTitle("Simple Calculator");
        setSize(400, 300);
        setLayout(new GridLayout(6, 2, 10, 10));

        // Input fields
        add(new JLabel("Number 1:"));
        t1 = new JTextField();
        add(t1);

        add(new JLabel("Number 2:"));
        t2 = new JTextField();
        add(t2);

        add(new JLabel("Result:"));
        result = new JTextField();
        result.setEditable(false);
        add(result);

        // Buttons
        add = new JButton("Add");
        sub = new JButton("Subtract");
        mul = new JButton("Multiply");
        div = new JButton("Divide");
        clear = new JButton("Clear");

        add(add);
        add(sub);
        add(mul);
        add(div);
        add(clear);

        // Event handling
        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        clear.addActionListener(this);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double n1 = Double.parseDouble(t1.getText());
            double n2 = Double.parseDouble(t2.getText());
            double res = 0;

            if (e.getSource() == add) {
                res = n1 + n2;
            } else if (e.getSource() == sub) {
                res = n1 - n2;
            } else if (e.getSource() == mul) {
                res = n1 * n2;
            } else if (e.getSource() == div) {
                res = n1 / n2;
            } else if (e.getSource() == clear) {
                t1.setText("");
                t2.setText("");
                result.setText("");
                return;
            }

            result.setText(String.valueOf(res));

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Invalid Input");
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}