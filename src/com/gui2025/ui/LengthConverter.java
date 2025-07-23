package com.gui2025.ui;

import javax.swing.*;
import java.awt.*;

public class LengthConverter {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Length Converter");
        frame.setSize(350, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(5, 1, 5, 5));

        JTextField inputField = new JTextField();
        JLabel resultLabel = new JLabel("Result: ", SwingConstants.CENTER);

        String[] conversions = {
            "Meters to Centimeters",
            "Meters to Feet",
            "Centimeters to Meters",
            "Feet to Meters"
        };
        JComboBox<String> conversionBox = new JComboBox<>(conversions);

        JButton convertBtn = new JButton("Convert");

        convertBtn.addActionListener(_ -> {
            try {
                double input = Double.parseDouble(inputField.getText());
                String selected = (String) conversionBox.getSelectedItem();
                double result = 0;
                String unit = "";

                switch (selected) {
                    case "Meters to Centimeters":
                        result = input * 100;
                        unit = "cm";
                        break;
                    case "Meters to Feet":
                        result = input * 3.28084;
                        unit = "ft";
                        break;
                    case "Centimeters to Meters":
                        result = input / 100;
                        unit = "m";
                        break;
                    case "Feet to Meters":
                        result = input / 3.28084;
                        unit = "m";
                        break;
                }

                resultLabel.setText(String.format("Result: %.2f %s", result, unit));
            } catch (NumberFormatException ex) {
                resultLabel.setText("Invalid input!");
            }
        });

        frame.add(new JLabel("Enter value:", SwingConstants.CENTER));
        frame.add(inputField);
        frame.add(conversionBox);
        frame.add(convertBtn);
        frame.add(resultLabel);

        frame.setVisible(true);
    }
}
