package lesson_180;

import lesson_179.KBIcon;

import java.awt.*;

//Урок №180. Создание иконки обозначающей палец
public class FingerIcon extends KBIcon {

    public FingerIcon(String legend, int unit_size) {
        super(legend, unit_size, 100, 100);
    }

    public FingerIcon(String legend) {
        this(legend, DEFAULT_SIZE);
    }

    public synchronized void paintComponent(Graphics g) {
        super.paintComponent(g);
        Dimension d = getSize();

        if (legend != null) {
            Color color = (highlight_color != null) ? highlight_color : getForeground();
            g.setColor(color);
            g.fillOval(2, 2, d.width - 4, d.height - 4);

            if (show_legend) {
                if (!color.equals(Color.black)) g.setColor(Color.black);
                else g.setColor(Color.white);

                FontMetrics fm = g.getFontMetrics();

                g.drawString(legend, (d.width - fm.stringWidth(legend)) / 2, (d.height - fm.getAscent()) / 2);
            } else {
                g.setColor(getForeground());
                g.fillOval(2, 2, d.width - 4, d.height - 4);
            }
        }
    }
}
