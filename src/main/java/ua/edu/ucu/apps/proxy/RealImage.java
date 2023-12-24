package ua.edu.ucu.apps.proxy;

import javax.swing.*;

public class RealImage implements MyImage {
    private JFrame frame;

    public RealImage(String file) {
        ImageIcon icon = new ImageIcon(file);
        JLabel label = new JLabel(icon);
        frame = new JFrame();
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
    }

    public void display() {
        frame.setVisible(true);
    }
}