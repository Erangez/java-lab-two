package org.view;

import javax.swing.*;

public class Frame extends JFrame{
    Frame(){
        // Базовое окно
        ImageIcon icon = new ImageIcon("logo.png");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.setIconImage(icon.getImage());
        this.setTitle("Расчёт ИМТ");

        // UI

        // Функционал

        // Добавление


    }
}
