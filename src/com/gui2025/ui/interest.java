package com.gui2025.ui;
import javax.swing.*;
import java.awt.event.*;

public class interest {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Simple Interest Calculator");
        frame.setSize(350, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel principalLabel = new JLabel("Principal:");
        principalLabel.setBounds(30, 30, 80, 25);
        JTextField principalField = new JTextField();
        principalField.setBounds(120, 30, 150, 25);

        JLabel rateLabel = new JLabel("Rate (%):");
        rateLabel.setBounds(30, 70, 80, 25);
        JTextField rateField = new JTextField();
        rateField.setBounds(120, 70, 150, 25);

        JLabel timeLabel = new JLabel("Time (yrs):");
        timeLabel.setBounds(30, 110, 80, 25);
        JTextField timeField = new JTextField();
        timeField.setBounds(120, 110, 150, 25);

        JLabel resultLabel = new JLabel("Interest: ");
        resultLabel.setBounds(30, 190, 250, 25);

        JButton calcButton = new JButton("Calculate");
        calcButton.setBounds(120, 150, 100, 30);

        calcButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double p = Double.parseDouble(principalField.getText());
                    double r = Double.parseDouble(rateField.getText());
                    double t = Double.parseDouble(timeField.getText());
                    double interest = (p * r * t) / 100;
                    resultLabel.setText("Interest: Rs. " + interest);
                } catch (Exception ex) {
                    resultLabel.setText("Please enter valid numbers!");
                }
            }
        });
        
        frame.add(principalLabel);
        frame.add(principalField);
        frame.add(rateLabel);
        frame.add(rateField);
        frame.add(timeLabel);
        frame.add(timeField);
        frame.add(calcButton);
        frame.add(resultLabel);

        frame.setVisible(true);
    }
}
