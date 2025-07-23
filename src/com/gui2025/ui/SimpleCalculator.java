package com.gui2025.ui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleCalculator {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Calculator");
        frame.setSize(350, 180);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JTextField num1 = new JTextField(5);
        JTextField num2 = new JTextField(5);
        JLabel result = new JLabel("Result:");

        JButton add = new JButton("+");
        JButton sub = new JButton("-");
        JButton mul = new JButton("*");
        JButton div = new JButton("/");

        ActionListener calc = e -> {
            try {
                double a = Double.parseDouble(num1.getText());
                double b = Double.parseDouble(num2.getText());
                double res = 0;

                if (e.getSource() == add) res = a + b;
                if (e.getSource() == sub) res = a - b;
                if (e.getSource() == mul) res = a * b;
                if (e.getSource() == div) {
                    if (b == 0) throw new ArithmeticException();
                    res = a / b;
                }

                result.setText("Result: " + res);
            } catch (Exception ex) {
                result.setText("Error!");
            }
        };

        add.addActionListener(calc);
        sub.addActionListener(calc);
        mul.addActionListener(calc);
        div.addActionListener(calc);

        frame.add(num1);
        frame.add(num2);
        frame.add(add);
        frame.add(sub);
        frame.add(mul);
        frame.add(div);
        frame.add(result);

        frame.setVisible(true);
    }
}

