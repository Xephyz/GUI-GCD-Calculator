package com.GCDCalcGUI;

import javax.swing.*;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

public class Frontend {
    private JButton button1;
    private JPanel panel1;
    private JFormattedTextField a6FormattedTextField;
    private JFormattedTextField a24FormattedTextField;

    public Frontend() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Hi!");
            }
        });
    }

    public Container getPanel(){
        return panel1;
    }


    private void createUIComponents() {
        NumberFormat format = NumberFormat.getInstance();

        NumberFormatter formatter = new NumberFormatter(format);
        formatter.setValueClass(Integer.class);
        formatter.setMinimum(0);
        formatter.setMaximum(Integer.MAX_VALUE);
        formatter.setAllowsInvalid(false);
        // If you want the value to be committed on each keystroke instead of focus lost
        formatter.setCommitsOnValidEdit(true);

        a6FormattedTextField  = new JFormattedTextField(formatter);
        a24FormattedTextField = new JFormattedTextField(formatter);

    }
}
