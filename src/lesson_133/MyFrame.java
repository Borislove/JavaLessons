package lesson_133;

import javax.swing.*;
import java.awt.*;

//Урок №133. Работаем с GUI. Метки
public class MyFrame extends JFrame {

    public MyFrame(String str) {
        super(str);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JLabel label = new JLabel("My Label");  //метка
        label.setToolTipText("Label text");   //текст подсказка
        label.setText("Text");
        c.add(label);


        JLabel label2 = new JLabel("My Labe2");  //метка
        c.add(label2);

        setSize(400, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame("My frame");
    }
}
