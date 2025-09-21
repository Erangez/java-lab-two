package org.view;

import javax.swing.*;
import java.awt.*;

public class AdvicePage extends JFrame {
    final int FRAME_WIDTH = 600, FRAME_HEIGHT = 300;
    AdvicePage(String textToShow){
        // Базовое окно
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setTitle("Совет по результату ИМТ");
        this.setResizable(false);
        this.setBackground(Frame.BACKGROUND_COLOR);

        JLabel label = new JLabel();
        label.setOpaque(true);
        label.setBackground(Frame.PANEL_COLOR);
        label.setFont(Frame.BASE_FONT_20pt);
        label.setForeground(Color.WHITE);
        label.setText(textToShow);
        this.add(label);
    }
}
