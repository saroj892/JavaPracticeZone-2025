package com.gui2025.ui;

import javax.swing.*;
import java.awt.*;

public class GradeCalculator {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Grade Calculator");
        frame.setSize(350, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(7, 2));

        JTextField[] marks = new JTextField[5];
        for (int i = 0; i < 5; i++) {
            frame.add(new JLabel("Subject " + (i + 1) + ":"));
            marks[i] = new JTextField();
            frame.add(marks[i]);
        }

        JLabel resultLabel = new JLabel("Result:");
        JButton calcBtn = new JButton("Calculate");

        calcBtn.addActionListener(_ -> {
            try {
                int total = 0;
                for (JTextField field : marks) {
                    total += Integer.parseInt(field.getText().trim());
                }

                double percent = total / 5.0;
                String grade;
                if (percent >= 80) grade = "A+";
                else if (percent >= 70) grade = "A";
                else if (percent >= 60) grade = "B";
                else if (percent >= 50) grade = "C";
                else if (percent >= 40) grade = "D";
                else grade = "F";

                resultLabel.setText(String.format("Total: %d, Percent: %.2f%%, Grade: %s", total, percent, grade));
            } catch (Exception ex) {
                resultLabel.setText("Invalid marks input.");
            }
        });

        frame.add(calcBtn);
        frame.add(resultLabel);
        frame.setVisible(true);
    }
}