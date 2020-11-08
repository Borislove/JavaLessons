package lesson_136;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Урок №136. Кнопки
public class MyFrame extends JFrame {

    JButton button;

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

        button = new JButton("MyNumber button");
        c.add(button);
        Handler handler = new Handler();
        button.addActionListener(handler);

        setSize(400, 150);

        setVisible(true);

    }

    class Handler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == button)
                JOptionPane.showMessageDialog(null, "button");
        }
    }

    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame("MyNumber frame");
    }
}



