package lesson_105;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

//Урок №105. Java. 2D
public class My2D extends JApplet {

    public void paint(Graphics g) {
        super.paint(g);

        Graphics2D g2 = (Graphics2D) g;

        g2.setPaint(new GradientPaint(5, 20, Color.orange, 30, 100, Color.blue, false));

        g2.fill(new Rectangle2D.Double(20, 30, 60, 100));

        //рамка
        g2.setPaint(Color.RED);
        g2.setStroke(new BasicStroke(10.0f));
        //g2.draw(new Rectangle2D.Double(20,30,60,100));
        g2.draw(new Rectangle2D.Double(20,10,60,100));
    }
}
