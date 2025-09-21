package org.view;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame implements ActionListener {
    final int FRAME_WIDTH = 600, FRAME_HEIGHT = 600;
    static final Color BACKGROUND_COLOR = new Color(28,27,33);
    static Color PANEL_COLOR = new Color(48,46,56);
    final Color TRANSPARENT_COLOR = new Color(0,0,0,0);
    
    final Font BASE_FONT_14pt = new Font("Segoe UI", Font.PLAIN, 14);
    final Font BASE_FONT_16pt = new Font("Segoe UI", Font.PLAIN, 16);
    static final Font BASE_FONT_20pt = new Font("Segoe UI", Font.PLAIN, 20);

    final Border transparentBorder = BorderFactory.createLineBorder(TRANSPARENT_COLOR, 1);

    JButton confirmButton;
    JTextField textField, textField1;
    JLabel bmiLabel;

    Frame(){

        // Базовое окно
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
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
        headerLabel.setPreferredSize(new Dimension(FRAME_WIDTH, 50));
        headerLabel.setOpaque(true);
        headerLabel.setBackground(PANEL_COLOR);

        JLabel functionLabel = new JLabel();
        functionLabel.setFont(BASE_FONT_16pt);
        functionLabel.setText("<html>Расчётная формула:<br>" +
                "<i>BMI = вес / рост*рост</i></html>");
        functionLabel.setForeground(Color.WHITE);
        functionLabel.setHorizontalAlignment(JLabel.CENTER);

        JPanel topPanel = new JPanel();
        topPanel.setOpaque(false);
        topPanel.setLayout(new BorderLayout());

        JPanel textFieldPanel = new JPanel();
        textFieldPanel.setOpaque(false);
        textFieldPanel.setLayout(new GridLayout(3,2));
        textFieldPanel.setPreferredSize(new Dimension(FRAME_WIDTH, 50));

        JPanel textFieldPanelOne = new JPanel();
        textFieldPanelOne.setOpaque(false);
        textFieldPanelOne.setPreferredSize(new Dimension(FRAME_WIDTH, 20));

        JLabel textLabelOne = new JLabel();
        textLabelOne.setOpaque(false);
        textLabelOne.setFont(BASE_FONT_14pt);
        textLabelOne.setForeground(Color.WHITE);
        textLabelOne.setText("Введите массу тела (кг), например, 65.4");

        JPanel textFieldPanelTwo = new JPanel();
        textFieldPanelTwo.setOpaque(false);
        textFieldPanelTwo.setPreferredSize(new Dimension(FRAME_WIDTH, 20));

        JLabel textLabelTwo = new JLabel();
        textLabelTwo.setOpaque(false);
        textLabelTwo.setFont(BASE_FONT_14pt);
        textLabelTwo.setForeground(Color.WHITE);
        textLabelTwo.setText("Введите рост (м), например, 1.8");

        textField = new JTextField();
        textField.setBackground(PANEL_COLOR);
        textField.setForeground(Color.WHITE);
        textField.setFont(BASE_FONT_16pt);
        textField.setToolTipText("Введите массу тела (кг) через точку..");
        textField.setPreferredSize(new Dimension(100, 30));
        textField.setBorder(transparentBorder);
        textField.setHorizontalAlignment(JTextField.CENTER);

        textField1 = new JTextField();
        textField1.setBackground(PANEL_COLOR);
        textField1.setForeground(Color.WHITE);
        textField1.setFont(BASE_FONT_16pt);
        textField1.setToolTipText("Введите рост (м) через точку..");
        textField1.setPreferredSize(new Dimension(100, 50));
        textField1.setBorder(transparentBorder);
        textField1.setHorizontalAlignment(JTextField.CENTER);

        JPanel emptyPanel = new JPanel();
        emptyPanel.setOpaque(false);
        JPanel emptyPanel1 = new JPanel();
        emptyPanel1.setOpaque(false);


        UIManager.put("Button.select", Color.GRAY);
        confirmButton = new JButton("Рассчитать");
        confirmButton.addActionListener(this);
        confirmButton.setFont(BASE_FONT_16pt);
        confirmButton.setOpaque(true);
        confirmButton.setBackground(PANEL_COLOR);
        confirmButton.setForeground(Color.WHITE);
        confirmButton.setBorder(BorderFactory.createLineBorder(BACKGROUND_COLOR, 20));
        confirmButton.setPreferredSize(new Dimension(FRAME_WIDTH, 50));

        bmiLabel = new JLabel();
        bmiLabel.setBackground(PANEL_COLOR);
        bmiLabel.setFont(BASE_FONT_16pt);
        bmiLabel.setForeground(Color.WHITE);
        bmiLabel.setOpaque(true);
        bmiLabel.setHorizontalAlignment(JLabel.CENTER);
        bmiLabel.setBorder(BorderFactory.createLineBorder(BACKGROUND_COLOR, 10));

        bmiLabel.setBackground(BACKGROUND_COLOR);
        bmiLabel.setFont(BASE_FONT_16pt);
        bmiLabel.setForeground(Color.WHITE);
        bmiLabel.setOpaque(true);
        bmiLabel.setHorizontalAlignment(JLabel.CENTER);
        bmiLabel.setBorder(BorderFactory.createLineBorder(BACKGROUND_COLOR, 10));

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

        // Добавление
        this.add(mainPanel);
        mainPanel.add(topPanel);
        topPanel.add(buttonInfo, BorderLayout.EAST);
        mainPanel.add(headerLabel);
        mainPanel.add(functionLabel);
        mainPanel.add(textFieldPanel);

        textFieldPanel.add(textLabelOne);
        textFieldPanel.add(textField);
        textFieldPanel.add(emptyPanel);
        textFieldPanel.add(emptyPanel1);
        textFieldPanel.add(textLabelTwo);
        textFieldPanel.add(textField1);

        mainPanel.add(confirmButton);
        mainPanel.add(bmiLabel);

    }
    public void actionPerformed(ActionEvent event){
        if(event.getSource() == confirmButton){
            String weightText = textField.getText();
            String heightText = textField1.getText();
            if (isDouble.checkStringToDouble(weightText) && isDouble.checkStringToDouble(heightText)) {
                double weight = Double.parseDouble(weightText);
                double height = Double.parseDouble(heightText);
                double bmi;
                if (weight > 0 && height > 0 && height < 3) {
                    bmi = Processing.calculateBMI(height, weight);
                    bmiLabel.setText(String.format("ИМТ = %.1f", bmi));
                    if (bmi < 18.5){
                        new AdvicePage(AdviceTexts.BMI_1.getAdviceText()).setVisible(true);
                    }
                    else if(bmi >= 18.5 && bmi < 25){
                        new AdvicePage(AdviceTexts.BMI_2.getAdviceText()).setVisible(true);
                    }
                    else if(bmi >= 25 && bmi < 30){
                        new AdvicePage(AdviceTexts.BMI_3.getAdviceText()).setVisible(true);
                    }
                    else{
                        new AdvicePage(AdviceTexts.BMI_4.getAdviceText()).setVisible(true);
                    }
                }
                else{
                    bmiLabel.setText("Введённые значения не соответствуют реальности.");
                }
            }
            else{
                bmiLabel.setText("Некорректные данные!");
            }
        }
    }
}
