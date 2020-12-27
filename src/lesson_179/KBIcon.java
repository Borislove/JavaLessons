package lesson_179;

import javax.swing.*;
import java.awt.*;

//Урок №179. Создание иконки клавиши
public abstract class KBIcon extends JPanel {
    public static final int DEFAULT_SIZE = 30;
    protected String legend;
    protected boolean show_legend = true;
    protected Dimension pref_size;

    protected Color highlight_color;

    public KBIcon(String legend, int unit_size, int width_factor, int height_factor) {
        this.pref_size = new Dimension(unit_size * width_factor / 100, unit_size * height_factor / 100);
        set_legend(legend);
    }

    public KBIcon(String legend, int width_factor) {
        this(legend, DEFAULT_SIZE, width_factor, 100);
    }

    public synchronized Dimension getPreferredSize() {
        return (pref_size);
    }

    public synchronized Dimension getMinimumSize() {
        return (pref_size);
    }

    public synchronized void update(Graphics g) {
        paint(g);
    }

    public synchronized String get_legend() {
        return (legend);
    }

    public synchronized void set_legend(String legend) {
        if (!legend.equals(this.legend)) {
            this.legend = legend;
            repaint();
        }
    }

    public synchronized void show_legend(boolean show_legend) {
        if (show_legend != this.show_legend) {
            this.show_legend = show_legend;
            repaint();
        }
    }

    public synchronized void set_highlight(Color color) {
        if (color != highlight_color) {
            highlight_color = color;
            repaint();
        }
    }

    public synchronized void clear_highlight() {
        set_highlight(null);
    }
}
