package lesson_137;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

//Урок №137. Java. Работаем с GUI. Флажки
//меняет цвет текста
public class MyFrame extends JFrame {

    JTextField text;
    JCheckBox check;


    public MyFrame(String str) {
        super(str);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JLabel label = new JLabel("MyNumber Label");  //метка
        label.setToolTipText("Label text");   //текст подсказка
        label.setText("Text");
        c.add(label);

        JLabel label2 = new JLabel("MyNumber Labe2");  //метка
        c.add(label2);

        text = new JTextField("Text");
        c.add(text);

        check = new JCheckBox("Red");
        c.add(check);
        Handler handler = new Handler();
        check.addItemListener(handler);

        setSize(400, 150);

        setVisible(true);

    }

    class Handler implements ItemListener {
        Color color;

        public void itemStateChanged(ItemEvent e) {
            if (e.getSource() == check) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    color = text.getBackground();
                    text.setBackground(Color.red);
                } else text.setBackground(color);
            }
        }
    }

    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame("MyNumber frame");
    }
}


