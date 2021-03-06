package lesson_158;

//Урок №158. Java. Работа с меню. Создание меню (Часть 3)

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame {

    JLabel text;
    Color colors[] = {Color.red, Color.blue, Color.green};
    String color_names[] = {"Red", "Blue", "Green"};
    JRadioButtonMenuItem[] colItems;
    ButtonGroup group;

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

        JMenu format = new JMenu("Format (R)");
        format.setMnemonic('R');
        JMenu colorMenu = new JMenu("Colors(C)");
        colorMenu.setMnemonic('C');
        colItems = new JRadioButtonMenuItem[colors.length];
        group = new ButtonGroup();
        Handler iHandler = new Handler();

        for (int i = 0; i < colors.length; i++) {
            colItems[i] = new JRadioButtonMenuItem(color_names[i]);
            group.add(colItems[i]);
            colorMenu.add(colItems[i]);
            colItems[i].addActionListener(iHandler);
        }

        format.add(colorMenu);
        bar.add(format);
        text = new JLabel("Text");

        Container c = getContentPane();
        c.setLayout(new BorderLayout());
        c.add(text);
        text.setForeground(Color.red);

        setSize(300, 100);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    class Handler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            for (int i = 0; i < colors.length; i++) {
                if (colItems[i].isSelected()) {
                    text.setForeground(colors[i]);
                    break;
                }
            }
            repaint();
        }
    }

    public static void main(String[] args) {
        new MyFrame("");
    }
}



