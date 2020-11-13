package lesson_135;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Урок №135. JTextField и JPasswordField
public class MyFrame extends JFrame {

    JTextField field1;   //текстовое поле
    JPasswordField field2;  //поле со звездочками

    public MyFrame(String str) {
        super(str);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JLabel label = new JLabel("MyNumber Label");  //метка
        label.setToolTipText("Label text");   //текст подсказка
        label.setText("Text");
        c.add(label);

        JLabel label2 = new JLabel("MyNumber Labe2");  //метка
        c.add(label2);

        field1 = new JTextField("Text");
        c.add(field1);

        field2 = new JPasswordField("Hidden text");
        c.add(field2);

        setSize(400, 150);

        setVisible(true);
        FieldHandler handler = new FieldHandler();
        field1.addActionListener(handler);
        field2.addActionListener(handler);
    }

    class FieldHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == field1) JOptionPane.showMessageDialog(null, "Text Field");
            else JOptionPane.showMessageDialog(null, "Password Field");
        }
    }

    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame("MyNumber frame");
    }
}


