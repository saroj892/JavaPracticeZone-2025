package com.gui2025.ui;

import javax.swing.*;
import java.awt.*;

public class BMICalculator {
    public static void main(String[] args) {
        JFrame frame = new JFrame("BMI Calculator");
        frame.setSize(300, 220);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(4, 1));

        JTextField weightField = new JTextField();
        JTextField heightField = new JTextField();
        JLabel resultLabel = new JLabel("BMI: ");

        JPanel p1 = new JPanel(new BorderLayout());
        p1.add(new JLabel("Weight (kg):"), BorderLayout.NORTH);
        p1.add(weightField, BorderLayout.CENTER);

        JPanel p2 = new JPanel(new BorderLayout());
        p2.add(new JLabel("Height (m):"), BorderLayout.NORTH);
        p2.add(heightField, BorderLayout.CENTER);

        JButton calcBtn = new JButton("Calculate BMI");
        calcBtn.addActionListener(_ -> {
            try {
                double weight = Double.parseDouble(weightField.getText());
                double height = Double.parseDouble(heightField.getText());
                double bmi = weight / (height * height);

                String category;
                if (bmi < 18.5) category = "Underweight";
                else if (bmi < 25) category = "Normal";
                else if (bmi < 30) category = "Overweight";
                else category = "Obese";

                resultLabel.setText(String.format("BMI: %.2f (%s)", bmi, category));
            } catch (Exception ex) {
                resultLabel.setText("Invalid input!");
            }
        });

        frame.add(p1);
        frame.add(p2);
        frame.add(calcBtn);
        frame.add(resultLabel);
        frame.setVisible(true);
    }
}
