package lesson_99;

import java.applet.Applet;
import java.awt.*;

//Урок №99. Java. Работа с цветом в апплете
/*
R - red
G-green
B - blue

0 - 255
*/
public class AppColor extends Applet {

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(new Color(0, 0, 0));
        g.fillRect(20, 20, 20, 20);

        g.setColor(new Color(255, 255, 255));
        g.fillRect(40, 40, 20, 20);
    }
}
