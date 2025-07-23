package com.gui2025.ui;
import javax.swing.*;
import java.awt.*;

public class TemperatureConverter {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Temperature Converter");
        frame.setSize(300, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(4, 1));

        JPanel panel1 = new JPanel(new BorderLayout());
        JLabel labelC = new JLabel("Enter °C:");
        JTextField textC = new JTextField();
        panel1.add(labelC, BorderLayout.NORTH);
        panel1.add(textC, BorderLayout.CENTER);

        JPanel panel2 = new JPanel(new BorderLayout());
        JLabel labelF = new JLabel("Fahrenheit:");
        JTextField textF = new JTextField();
        textF.setEditable(false);
        panel2.add(labelF, BorderLayout.NORTH);
        panel2.add(textF, BorderLayout.CENTER);

        JPanel panel3 = new JPanel(new BorderLayout());
        JLabel labelK = new JLabel("Kelvin:");
        JTextField textK = new JTextField();
        textK.setEditable(false);
        panel3.add(labelK, BorderLayout.NORTH);
        panel3.add(textK, BorderLayout.CENTER);

        JButton convertBtn = new JButton("Convert");
        convertBtn.addActionListener(_e -> {
            try {
                double celsius = Double.parseDouble(textC.getText());
                double fahrenheit = (celsius * 9/5) + 32;
                double kelvin = celsius + 273.15;
                textF.setText(String.format("%.2f °F", fahrenheit));
                textK.setText(String.format("%.2f K", kelvin));
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(frame, "Invalid input!");
            }
        });

        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
        frame.add(convertBtn);

        frame.setVisible(true);
    }
}
