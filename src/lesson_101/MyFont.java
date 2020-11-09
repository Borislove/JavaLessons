package lesson_101;

import javax.swing.*;
import java.awt.*;

//Урок №101 Работа со шрифтами
public class MyFont extends JApplet {

    public void paint(Graphics g) {
        super.paint(g);

        /*
         * Font
         *
         * */

        g.setFont(new Font("Serif", Font.BOLD, 12));
        g.drawString("Serif bold 12", 10, 10);

        g.setFont(new Font("Monospaced", Font.ITALIC, 20));
        g.setColor(new Color(41, 159, 72));
        g.drawString("Monospaced italic 20", 25, 25);
    }
}
