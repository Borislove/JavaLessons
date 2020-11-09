package lesson_103;

import javax.swing.*;
import java.awt.*;

public class Oval extends JApplet {

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.orange);
        //рисуем овал
        g.drawOval(25, 25, 100, 50);
        //овал с заливкой
        g.fillOval(25, 80, 50, 50);

        g.setColor(Color.MAGENTA);
        g.drawArc(25, 150, 50, 50, 10, 90);
    }
}
