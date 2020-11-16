package lesson_150;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Урок №150. Java. Изучаем GUI. JTextArea
public class MyFrame extends JFrame {

    JTextArea text;
    JButton button;

    public MyFrame(String str) {
        super(str);
        Container c = getContentPane();
        c.setLayout(new GridLayout(1, 2));

        text = new JTextArea("", 10, 15);
        c.add(text);

        button = new JButton("Submit");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, text.getText());
            }
        });

        c.add(button);

        setSize(300, 100);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
}

class Main {
    public static void main(String[] args) {
        new MyFrame("JPanel");
    }
}

