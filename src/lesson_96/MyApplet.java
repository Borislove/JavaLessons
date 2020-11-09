package lesson_96;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;

public class MyApplet extends Applet {
    public void paint(Graphics g){
        super.paint(g);
        g.drawString("Welcome in java!", 25,25);
    }
}
