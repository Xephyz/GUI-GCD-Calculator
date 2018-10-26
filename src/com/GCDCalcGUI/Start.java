package com.GCDCalcGUI;

import javax.swing.*;

public class Start {

    public static void main(String[] args) {
        JFrame frame = new JFrame("GCD Calculator");
        frame.setContentPane(new Frontend().getPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(400,250);
    }
}
