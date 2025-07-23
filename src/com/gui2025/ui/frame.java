package com.gui2025.ui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class frame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("New Frame");
        frame.setSize(300, 150);
        frame.getContentPane().setBackground(Color.CYAN); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel label = new JLabel("New Label");
        label.setBounds(30, 20, 80, 30);

        JTextField textfield = new JTextField();
        textfield.setBounds(100, 20, 120, 30);

        JButton button = new JButton("Submit");
        button.setBounds(100, 60, 100, 30);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button clicked successfully");
                JOptionPane.showMessageDialog(frame, "Button clicked successfully");
            }
        });

        frame.add(label);
        frame.add(textfield);
        frame.add(button);
        frame.setVisible(true);
    }
}
