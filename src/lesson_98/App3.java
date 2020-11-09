package lesson_98;

import javax.swing.*;
import java.awt.*;

/**
 * public void init()
 * public void start()
 * public void paint (Graphics g)
 * public void stop()
 * public void destroy()
 */

public class App3 extends JApplet {

    String input;
    public void init(){
        input = JOptionPane.showInputDialog("Enter your text");
    }

    public void paint(Graphics g){
        super.paint(g);

        g.drawString("Your text is "+input, 25,25);
    }
}
