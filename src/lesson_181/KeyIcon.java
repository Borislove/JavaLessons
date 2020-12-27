package lesson_181;

import lesson_179.KBIcon;

import java.awt.*;

//Урок №181. Создание класса KeyIcon (Часть 1)
public class KeyIcon extends KBIcon {
    private boolean position_upperleft;

    public KeyIcon(String legend, int unit_size, int width_factor, int height_factor) {
        super(legend, unit_size, width_factor, height_factor);
        set_legend(legend);
    }

    public KeyIcon(String legend, int width_factor) {
        this(legend, DEFAULT_SIZE, width_factor, 100);
    }

    public synchronized void paint(Graphics g) {
        super.paintComponent(g);
        Dimension d = getSize();
        if (legend != null) {
            Color color = (highlight_color != null) ? highlight_color : getForeground();
            g.setColor(color);
            g.fillRect(2, 2, d.width - 4, d.height - 4);
            if (show_legend) {
                if (!color.equals(Color.black)) {
                    g.setColor(Color.black);
                } else
                    g.setColor(Color.white);
            }
            FontMetrics fm = g.getFontMetrics();
            if(position_upperleft)g.drawString(legend,3,fm.getAscent()+3);
            else g.drawString(legend, (d.width - fm.stringWidth(legend))/2,(d.height+fm.getAscent()/2));
        }
    }
}
