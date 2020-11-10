package lesson_104;

import javax.swing.*;
import java.awt.*;

//Урок №104. Java. Рисование многоугольников
public class MyPol extends JApplet {
    public void paint(Graphics g) {
        super.paint(g);

    int[] x = {10, 20, 30, 20};
    int[] y ={20,10,60,80};

        g.drawPolygon(x,y,4);

        Polygon pol = new Polygon();
        pol.addPoint(10,20);
        pol.addPoint(20,30);
        pol.addPoint(40,10);
        pol.addPoint(50,10);
        pol.addPoint(40,50);

        g.fillPolygon(pol);

        int x1[] ={30,60,30};
        int y1[] ={40,10,20};
        g.setColor(Color.red);
        g.drawPolyline(x1,y1,3);
    }
}
