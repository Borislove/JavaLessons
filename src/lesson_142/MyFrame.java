package lesson_142;

//Урок №142. Java. Обработка событий мыши

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MyFrame extends JFrame implements MouseListener, MouseMotionListener {

    JTextField text;

    public MyFrame(String str) {
        super(str);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        text = new JTextField("                                   ");
        c.add(text);

        addMouseListener(this);
        addMouseMotionListener(this);

        setSize(300, 100);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public void mouseClicked(MouseEvent e) {
        text.setText("Click in " + e.getX() + " " + e.getY());
    }

    public void mousePressed(MouseEvent e) {
        text.setText("Press in " + e.getX() + " " + e.getY());
    }

    public void mouseReleased(MouseEvent e) {
        text.setText("Release in " + e.getX() + " " + e.getY());
    }

    public void mouseEntered(MouseEvent e) {
        text.setText("Enter");
    }

    public void mouseExited(MouseEvent e) {
        text.setText("Exit");
    }

    public void mouseDragged(MouseEvent e) {
        text.setText("Drag in " + e.getX() + " " + e.getY());
    }

    public void mouseMoved(MouseEvent e) {
        text.setText("Move in " + e.getX() + " " + e.getY());
    }


    public static void main(String[] args) {
        //  MyFrame myFrame = new MyFrame("MyNumber frame");
        new MyFrame("Mouse ");
    }
}





