package lesson_156;

//Урок №156. Java. Работа с меню. Создание меню (Часть 1)

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame {

    public MyFrame(String str) {
        super(str);

        JMenu file = new JMenu("File(F)");
        file.setMnemonic('F');
        JMenuItem about = new JMenuItem("About(A)");
        about.setMnemonic('A');
        about.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "About");
            }
        });

        file.add(about);

        JMenuBar bar = new JMenuBar();
        setJMenuBar(bar);
        bar.add(file);

        Container c = getContentPane();
        c.setLayout(new BorderLayout());

        setSize(300, 100);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        new MyFrame("");
    }
}

