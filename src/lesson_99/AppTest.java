package lesson_99;

import java.applet.Applet;
import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;

//рисует!
public class AppTest extends Applet {

    public void Next() throws InterruptedException {
        Thread.sleep(10);
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(new Color(0, 0, 0));

        for (int i = 0; i < 1000; i++) {

            g.fillRect(i, 10, 10, 10);
            try {
                Next();
            } catch (InterruptedException ex) {
                Logger.getLogger(AppTest.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

