package lesson_102;

import javax.swing.*;
import java.awt.*;

//Рисование линий и прямоугольников
public class MyShape extends JApplet {

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.orange);
        //линия
        g.drawLine(5, 25, 350, 30);

        //прямоугольник
        g.setColor(Color.blue);
        g.fillRect(5, 35, 200, 10);
        //прямоугольник с закругленными краями
        g.setColor(Color.MAGENTA);
        g.fillRoundRect(5, 50, 30, 30, 5, 5);
    }
}
