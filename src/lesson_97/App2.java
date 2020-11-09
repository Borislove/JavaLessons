package lesson_97;

import javax.swing.*;
import java.awt.*;

public class App2 extends JApplet {
    public void paint(Graphics g) {
        super.paint(g);
        g.drawString("Welcome", 25, 25);
        g.drawString("In java", 30, 50);

        g.drawLine(15, 30, 210, 30);
        g.drawLine(10, 50, 210, 30);
    }
}
