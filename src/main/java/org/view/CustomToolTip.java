package org.view;

import javax.swing.*;
import java.awt.*;

public class CustomToolTip extends JToolTip {
    public CustomToolTip(Color bgColor, Color fgColor, Font font) {
        setBackground(bgColor);
        setForeground(fgColor);
        setFont(font);
    }
}
