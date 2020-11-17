package lesson_158;

//Box

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class MyFrameB extends JFrame {

    JLabel text;
    Color colors[] = {Color.red, Color.blue, Color.green};
    String color_names[] = {"Red", "Blue", "Green"};
    JRadioButtonMenuItem[] colItems;
    JCheckBoxMenuItem[] colItems2;
    ButtonGroup group;

    public MyFrameB(String str) {
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

        JMenu format2 = new JMenu("Format2(T)");
        format2.setMnemonic('T');
        JMenu colorMenu2 = new JMenu("Color 2(O)");
        CheckHandler handler2 = new CheckHandler();
        colorMenu2.setMnemonic('O');
        colItems2 = new JCheckBoxMenuItem[colors.length];
        for (int i = 0; i < colors.length; i++) {
            colItems2[i] = new JCheckBoxMenuItem(color_names[i]);
            colorMenu2.add(colItems2[i]);
            colItems2[i].addItemListener(handler2);
        }
        format2.add(colorMenu2);
        bar.add(format2);

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

    class CheckHandler implements ItemListener {
        int r = 0;
        int g = 0;
        int b = 0;

        public void itemStateChanged(ItemEvent e) {
            if (colItems2[0].isSelected()) r = 128;
            else r = 0;
            if (colItems2[1].isSelected()) b = 128;
            else b = 0;
            if (colItems2[2].isSelected()) g = 128;
            else g = 0;

            text.setForeground(new Color(r, g, b));
            repaint();
        }
    }

    public static void main(String[] args) {
        new MyFrameB("");
    }
}




