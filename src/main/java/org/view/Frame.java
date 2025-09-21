package org.view;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.view.isDouble.*;
public class Frame extends JFrame implements ActionListener {

    final Color BACKGROUND_COLOR = new Color(28,27,33);
    final Color PANEL_COLOR = new Color(48,46,56);
    final Color TRANSPARENT_COLOR = new Color(0,0,0,0);
    final Font BASE_FONT_14pt = new Font("Segoe UI", Font.PLAIN, 14);
    final Font BASE_FONT_16pt = new Font("Segoe UI", Font.PLAIN, 16);
    final Font BASE_FONT_20pt = new Font("Segoe UI", Font.PLAIN, 20);

    JButton confirmButton;
    JTextField textField, textField1;
    Frame(){

        int frame_width = 600, frame_height = 600;

        // Базовое окно
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(frame_width, frame_height);
        this.setTitle("Расчёт ИМТ");
        this.setResizable(false);
        this.setLayout(new BorderLayout());

        // UI
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(7, 4));
        mainPanel.setBackground(BACKGROUND_COLOR);
        Border border = BorderFactory.createLineBorder(BACKGROUND_COLOR, 10);
        mainPanel.setBorder(border);

        JLabel headerLabel = new JLabel();
        headerLabel.setFont(BASE_FONT_20pt);
        headerLabel.setText("Программа для расчёта ИМТ");
        headerLabel.setForeground(Color.WHITE);
        headerLabel.setHorizontalAlignment(JLabel.CENTER);
        headerLabel.setPreferredSize(new Dimension(frame_width, 50));
        headerLabel.setOpaque(true);
        headerLabel.setBackground(PANEL_COLOR);

        JLabel functionLabel = new JLabel();
        functionLabel.setFont(BASE_FONT_16pt);
        functionLabel.setText("<html>Расчётная формула:<br>" +
                "<i>BMI = вес / рост*рост</i></html>");
        functionLabel.setForeground(Color.WHITE);

        JPanel topPanel = new JPanel();
        topPanel.setOpaque(false);
        topPanel.setLayout(new BorderLayout());

        JPanel textFieldPanel = new JPanel();
        textFieldPanel.setOpaque(false);
        textFieldPanel.setLayout(new FlowLayout(FlowLayout.LEADING, 20,0));
        textFieldPanel.setPreferredSize(new Dimension(frame_width, 50));

        Border border1 = BorderFactory.createLineBorder(TRANSPARENT_COLOR, 1);
        textField = new JTextField();
        textField.setBackground(PANEL_COLOR);
        textField.setForeground(Color.WHITE);
        textField.setFont(BASE_FONT_16pt);
        textField.setToolTipText("Введите массу тела (кг) через точку..");
        textField.setPreferredSize(new Dimension(250, 50));
        textField.setBorder(border1);

        textField1 = new JTextField();
        textField1.setBackground(PANEL_COLOR);
        textField1.setForeground(Color.WHITE);
        textField1.setFont(BASE_FONT_16pt);
        textField1.setToolTipText("Введите рост (м) через точку..");
        textField1.setPreferredSize(new Dimension(250, 50));
        textField1.setBorder(border1);

        confirmButton = new JButton("Рассчитать");
        confirmButton.addActionListener(this);
        confirmButton.setFont(BASE_FONT_16pt);

        JButton buttonInfo = new JButton("Об ИМТ") {
            @Override
            public JToolTip createToolTip(){
                return new CustomToolTip(BACKGROUND_COLOR, Color.WHITE, BASE_FONT_14pt);
            }
        };
        buttonInfo.setBackground(TRANSPARENT_COLOR);
        buttonInfo.setBorderPainted(false);
        buttonInfo.setFont(BASE_FONT_14pt);
        buttonInfo.setFocusPainted(false);
        buttonInfo.setEnabled(false);
        buttonInfo.setToolTipText("ИМТ (Индекс массы тела) - " +
                "это показатель, который помогает оценить " +
                "соотношение веса человека и его роста, " +
                "выявляя возможный недостаток или избыток веса");
        buttonInfo.setBounds(100,0,100,0);

        // Функционал

        // Добавление
        this.add(mainPanel);
        mainPanel.add(topPanel);
        topPanel.add(buttonInfo, BorderLayout.EAST);
        mainPanel.add(headerLabel);
        mainPanel.add(functionLabel);
        mainPanel.add(textFieldPanel);
        textFieldPanel.add(textField);
        textFieldPanel.add(textField1);
        mainPanel.add(confirmButton);
    }
    public void actionPerformed(ActionEvent event){
        if(event.getSource() == confirmButton){
            if (isDouble.checkStringToDouble(textField.getText()) && isDouble.checkStringToDouble(textField1.getText())){

            }

        }
    }
}
