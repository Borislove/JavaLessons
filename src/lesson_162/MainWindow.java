package lesson_162;

import javax.swing.*;
import java.awt.*;

//Урок №162. Работа с меню в главном окне
public class MainWindow extends javax.swing.JFrame {

    private JMenuItem file_exit;
    private JMenu file_menu;
    private JMenuItem help_about;
    private JMenu help_menu;
    private JMenuItem help_on_typist;
    private JMenuBar menu_bar;

    public MainWindow() {
        initComponents();
        this.setSize(500, 400);
        this.centered();      // TODO: 23.12.2020   setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        menu_bar = new javax.swing.JMenuBar();
        file_menu = new javax.swing.JMenu();
        file_exit = new javax.swing.JMenuItem();
        help_menu = new javax.swing.JMenu();
        help_about = new javax.swing.JMenuItem();
        help_on_typist = new javax.swing.JMenuItem();

        file_menu.setMnemonic('F');
        file_menu.setText("File");

        file_exit.setText("Exit");
        file_menu.add(file_exit);

        menu_bar.add(file_menu);

        help_menu.setMnemonic('H');
        help_menu.setText("Help");

        help_about.setText("About");
        help_menu.add(help_about);

        help_on_typist.setText("Help");
        help_on_typist.setToolTipText("");
        help_menu.add(help_on_typist);

        menu_bar.add(help_menu);

        setJMenuBar(menu_bar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 463, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 310, Short.MAX_VALUE)
        );
        pack();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //  setLocationRelativeTo(null);

        //выход при нажатии file, exit-->yes
        file_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                file_exitActionPerformed(evt);
            }
        });
    }

    //эвент для кнопочки file-->exit
    private void file_exitActionPerformed(java.awt.event.ActionEvent evt) {
        int result = JOptionPane.showConfirmDialog(this, "Do you really want to exit?", "Inforamtion", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (result != JOptionPane.NO_OPTION) {
            dispose();
            System.exit(0);
        }
    }

    //центрирование окна
    private void centered() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = this.getSize();
        if (frameSize.height > screenSize.height) {
            frameSize.height = screenSize.height;
        }
        if (frameSize.width > screenSize.width) {
            frameSize.width = screenSize.width;
        }
        this.setLocation((screenSize.width - frameSize.width) / 2, (screenSize.height - frameSize.height) / 2);
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }
}
