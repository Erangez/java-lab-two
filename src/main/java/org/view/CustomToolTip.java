package org.view;

import javax.swing.*;
import java.awt.*;

public class CustomToolTip extends JToolTip {
    CustomToolTip(Color bgColor, Color fgColor, Font font) {
        super();
        setBackground(bgColor);
        setForeground(fgColor);
        setFont(font);
    }
}
