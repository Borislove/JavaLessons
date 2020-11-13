package lesson_132;

import javax.swing.*;
import java.awt.*;

//Урок №132. Java. Рисование в JFrame
public class MyFrame extends JFrame {

    public void paint(Graphics g) {
        g.setFont(new Font("Serif", Font.ITALIC, 30));
        g.drawString("Hello Java!", 20, 100);
    }

    public MyFrame(String str) {
        super(str);
        setSize(400, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame("MyNumber frame");
    }
}



