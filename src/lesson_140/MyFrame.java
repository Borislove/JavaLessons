package lesson_140;

//Урок №140. Список с единственным выбором

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

public class MyFrame extends JFrame {

    JTextField text;

    JList list;
    String[] colors = {"red", "blue", "green", "yellow", "white"};
    Color[] stat = {Color.red, Color.blue, Color.green, Color.yellow, Color.white};

    public MyFrame(String str) {
        super(str);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JLabel label = new JLabel("MyNumber Label");  //метка
        label.setToolTipText("Label text");   //текст подсказка
        label.setText("Text");
        c.add(label);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel label2 = new JLabel("MyNumber Labe2");  //метка
        c.add(label2);

        text = new JTextField("Text");
        c.add(text);

        //создание списка
        list = new JList(colors);
        list.setVisibleRowCount(3);  //видимость элементов
        //единственный выбор
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        c.add(new JScrollPane(list));
        //обработчик
        list.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                text.setBackground(stat[list.getSelectedIndex()]);
            }
        });

        setSize(400, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame("MyNumber frame");
    }
}




