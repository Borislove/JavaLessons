package lesson_100;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;

//Java. Работа с JColorChooser
public class AppColor extends Applet {

    private Color myColor = Color.orange;

    public void init() {
        myColor = JColorChooser.showDialog(this, "Choose!", myColor);
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(myColor);
        g.fillRect(20, 20, 100, 50);
    }
}
