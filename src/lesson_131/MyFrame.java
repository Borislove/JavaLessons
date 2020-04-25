package lesson_131;

import javax.swing.*;

//Урок №131. Java. Работа с JFrame
public class MyFrame extends JFrame {

    public MyFrame(String str) {
        super(str);
        setSize(400, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame("My frame");
    }
}
