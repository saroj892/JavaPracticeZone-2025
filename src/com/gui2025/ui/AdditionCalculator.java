package com.gui2025.ui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AdditionCalculator {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Addition Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 120);
        frame.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));

        JTextField textField1 = new JTextField(5);
        JTextField textField2 = new JTextField(5);
        JButton addButton = new JButton("Add");
        JLabel resultLabel = new JLabel("Result:");

        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(textField1.getText());
                    int num2 = Integer.parseInt(textField2.getText());
                    int sum = num1 + num2;
                    resultLabel.setText("Result: " + sum);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Result: Invalid input");
                }
            }
        });

        frame.add(textField1);
        frame.add(textField2);
        frame.add(addButton);
        frame.add(resultLabel);

        frame.setVisible(true);
    }
}

