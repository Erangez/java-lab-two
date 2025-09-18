package org.view;

import javax.swing.*;
import java.awt.*;

public class GUIFrame {
    public static void main(String[] args) {
        // JFrame = a GUI window to add components to
        JFrame frame = new JFrame(); // creates a frame
        frame.setTitle("Test Program"); // sets title of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
        frame.setResizable(false); // prevent frame from being resized
        frame.setSize(420, 420); // sets the x-dimension, and y-dimension of frame
        frame.setVisible(true); // make frame visible

        ImageIcon icon = new ImageIcon("logo.png"); // create an ImageIcon
        frame.setIconImage(icon.getImage()); // change icon of frame
        frame.getContentPane().setBackground(new Color(50, 164, 168, 85)); // change color of background


    }
}
