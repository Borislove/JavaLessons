package lesson_99;

import java.applet.Applet;
import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AppTest2 extends Applet {
    public void Next() throws InterruptedException {
        Thread.sleep(10);
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(new Color(0, 0, 0));

        int y=10;

        for (int i = 0; i < 1000; i++) {

            g.fillRect(i, y, 10, 10);

            if (i == 300) {
                y++;
                i--;
            }

            if(y == 100){
                i-=2;
                if(i==0) y-=2;
            }

            System.out.println("i = "+i + "y = "+y);

            try {
                Next();
            } catch (InterruptedException ex) {
                Logger.getLogger(AppTest2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}






