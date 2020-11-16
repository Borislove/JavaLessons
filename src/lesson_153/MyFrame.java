package lesson_153;

//Урок №153. Java. Изучаем GUI. Ползунок

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

class MyPanel extends JPanel {
    int lenght = 5;

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.fillRect(5, 5, lenght, 5);
    }

    public void setLenght(int lenght) {
        this.lenght = (lenght > 0 ? lenght : 5);
        repaint();
    }
}

public class MyFrame extends JFrame {

    MyPanel panel;
    JSlider slider;

    public MyFrame(String str) {
        super(str);

        panel = new MyPanel();

        slider = new JSlider(SwingConstants.HORIZONTAL, 0, 200, 5);
        slider.setMajorTickSpacing(5);
        //slider.setPaintLabels(true);  //цифры
        slider.setPaintTicks(true); //деления
        slider.addChangeListener(new ChangeListener() {

            public void stateChanged(ChangeEvent e) {
                panel.setLenght(slider.getValue());
            }
        });

        Container c = getContentPane();
        c.setLayout(new BorderLayout());

        c.add(slider, BorderLayout.SOUTH);
        c.add(panel, BorderLayout.CENTER);

        setSize(300, 300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
}

class Main {
    public static void main(String[] args) {
        new MyFrame("JSlider");
    }
}




