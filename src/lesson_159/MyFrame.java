package lesson_159;

//Урок №159. Java. Работа с меню. Всплывающее меню

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyFrame extends JFrame {

    Color[] colors = {Color.red, Color.green, Color.blue};
    JRadioButtonMenuItem[] colorItem;
    JPopupMenu pop;

    public MyFrame(String str) {
        super(str);

        Ihandler handler = new Ihandler();
        String[] names = {"Red", "Green", "Blue"};
        ButtonGroup group = new ButtonGroup();
        pop = new JPopupMenu();
        colorItem = new JRadioButtonMenuItem[3];
        for (int i = 0; i < 3; i++) {
            colorItem[i] = new JRadioButtonMenuItem(names[i]);
            pop.add(colorItem[i]);
            group.add(colorItem[i]);
            colorItem[i].addActionListener(handler);
        }

        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                check(e);
            }

            public void mouseReleased(MouseEvent e) {
                check(e);
            }

            void check(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    pop.show(e.getComponent(), e.getX(), e.getY());
                }
            }
        });

        Container c = getContentPane();
        c.setLayout(new BorderLayout());

        setSize(300, 100);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    class Ihandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            for (int i = 0; i < 3; i++) {
                if (e.getSource() == colorItem[i]) {
                    getContentPane().setBackground(colors[i]);
                    repaint();
                    return;
                }
            }
        }
    }


    public static void main(String[] args) {
        new MyFrame("");
    }
}




