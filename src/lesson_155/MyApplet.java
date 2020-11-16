package lesson_155;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Урок №155. Программы как приложения и как апплеты
public class MyApplet extends JApplet {

    JLabel label;
    JButton b1;
    JButton b2;
    int w;
    int h;

    public void init() {

        setSize(w, h);
        label = new JLabel("First");
        b1 = new JButton("First");
        b2 = new JButton("Second");

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("First");
            }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Second");
            }
        });

        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.add(label);
        c.add(b1);
        c.add(b2);
    }

    void setWidht(int w) {
        this.w = w;
    }

    void setHeight(int h) {
        this.h = h;
    }

    public static void main(String[] args) {
        JFrame app = new JFrame("My App");
        MyApplet myApplet = new MyApplet();

        myApplet.setWidht(200);
        myApplet.setHeight(200);

        myApplet.init();
        myApplet.start();
        app.getContentPane().add(myApplet);
        app.setSize(200, 200);
        app.setVisible(true);
    }
}
