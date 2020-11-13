package lesson_131;

import javax.swing.*;
import java.awt.*;

//Урок №131. Работа с JFrame
//вывод простого окна
public class MyFrame extends JFrame {

    public MyFrame(String str) {
        super(str);
        setSize(400, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame("MyNumber frame");
    }
}
