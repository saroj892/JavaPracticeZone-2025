package com.gui2025.ui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CurrencyConverter {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Currency Converter");
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(4, 1));

        JPanel panel1 = new JPanel(new BorderLayout());
        JLabel labelNPR = new JLabel("Enter amount in NPR:");
        JTextField textNPR = new JTextField();
        panel1.add(labelNPR, BorderLayout.NORTH);
        panel1.add(textNPR, BorderLayout.CENTER);

        JPanel panel2 = new JPanel(new BorderLayout());
        JLabel labelINR = new JLabel("Amount in INR:");
        JTextField textINR = new JTextField();
        textINR.setEditable(false);
        panel2.add(labelINR, BorderLayout.NORTH);
        panel2.add(textINR, BorderLayout.CENTER);

        JPanel panel3 = new JPanel(new BorderLayout());
        JLabel labelUSD = new JLabel("Amount in USD:");
        JTextField textUSD = new JTextField();
        textUSD.setEditable(false);
        panel3.add(labelUSD, BorderLayout.NORTH);
        panel3.add(textUSD, BorderLayout.CENTER);

        JPanel panel4 = new JPanel();
        JButton convertButton = new JButton("Convert");

        convertButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double npr = Double.parseDouble(textNPR.getText());

                    double inr = npr * 0.63;   // Example: 1 NPR = 0.63 INR
                    double usd = npr * 0.0075; // Example: 1 NPR = 0.0075 USD

                    textINR.setText(String.format("%.2f", inr));
                    textUSD.setText(String.format("%.2f", usd));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter a valid number.");
                }
            }
        });

        panel4.add(convertButton);

        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
        frame.add(panel4);

        // Make frame visible
        frame.setVisible(true);
    }
}

