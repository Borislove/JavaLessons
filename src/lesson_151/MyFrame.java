package lesson_151;

//Урок №151. Java. Использование JPanel

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyPanel extends JPanel {

    public final static int RED = 1, GREEN = 2, YELLOW = 3;
    int color;

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (color == RED) g.setColor(Color.RED);
        else if (color == GREEN) g.setColor(Color.green);
        else if (color == YELLOW) g.setColor(Color.YELLOW);

        g.fillRect(50, 10, 60, 60);
    }

    public void draw(int color) {
        this.color = color;
        repaint();
    }
}

public class MyFrame extends JFrame {

    MyPanel myPanel;
    JPanel buttons;
    JButton redButton, greenButton, yellowButton;

    public MyFrame(String str) {
        super(str);

        myPanel = new MyPanel();
        redButton = new JButton("Red");
        redButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                myPanel.draw(MyPanel.RED);
            }
        });

        greenButton = new JButton("Green");
        greenButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                myPanel.draw(MyPanel.GREEN);
            }
        });

        yellowButton = new JButton("Yellow");
        yellowButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                myPanel.draw(MyPanel.YELLOW);
            }
        });

        buttons = new JPanel();
        buttons.setLayout(new GridLayout(1, 3));
        buttons.add(redButton);
        buttons.add(greenButton);
        buttons.add(yellowButton);

        Container c = getContentPane();
        c.setLayout(new BorderLayout());

        c.add(myPanel, BorderLayout.CENTER);
        c.add(buttons, BorderLayout.SOUTH);

        setSize(300, 300);
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


