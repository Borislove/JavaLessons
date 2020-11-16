package lesson_152;

//Урок №152. Использование JPanel для обработки событий

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class MyPanel extends JPanel {
    int x, y;

    public MyPanel() {
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                x = e.getX();
                y = e.getY();
                repaint();
            }
        });
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.fillRect(x, y, 10, 10);
    }
}

public class MyFrame extends JFrame {

    MyPanel myPanel;

    public MyFrame(String str) {
        super(str);

        myPanel = new MyPanel();

        Container c = getContentPane();
        c.setLayout(new BorderLayout());

        c.add(myPanel, BorderLayout.CENTER);

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



