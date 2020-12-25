package lesson_164;

import javax.swing.*;
import java.awt.*;

//Урок №163. Создание класса ExerciseGUI
public class MainWindow extends JFrame {

    private JMenuItem file_exit;
    private JMenu file_menu;
    private JMenuItem help_about;
    private JMenu help_menu;
    private JMenuItem help;
    private JMenuBar menu_bar;

    private JDesktopPane jDesktopPane1;

    public MainWindow() {
        this.setTitle("Typing");
        initComponents();
        this.setSize(500, 400);
        this.centered();

        //2 окно
        ExerciseGUI exercise = new ExerciseGUI();
        exercise.pack();
        exercise.validate();
        jDesktopPane1.add(exercise);
        exercise.setVisible(true);
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        menu_bar = new JMenuBar();
        file_menu = new JMenu();
        file_exit = new JMenuItem();
        help_menu = new JMenu();
        help_about = new JMenuItem();
        help = new JMenuItem();

        jDesktopPane1 = new JDesktopPane();

        GroupLayout jDesktopPane1Layout = new GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);

        jDesktopPane1Layout.setHorizontalGroup(
                jDesktopPane1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 463, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
                jDesktopPane1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 310, Short.MAX_VALUE)
        );

        //листенер для крестика
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        file_menu.setMnemonic('F');
        file_menu.setText("File");

        file_exit.setText("Exit");
        file_menu.add(file_exit);

        menu_bar.add(file_menu);

        help_menu.setMnemonic('H');
        help_menu.setText("Help");
        help_menu.setToolTipText("");

        help_menu.add(help_menu);

        help_about.setText("About");
        help_about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                help_aboutActionPerformed(evt);
            }
        });

        help_menu.add(help_about);

        help.setText("Help");
        //help.setToolTipText("");
        help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpActionPerformed(evt);
            }
        });

        help_menu.add(help);
        menu_bar.add(help_menu);


        setJMenuBar(menu_bar);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jDesktopPane1, GroupLayout.Alignment.TRAILING)
        );

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //выход при нажатии file, exit-->yes
        file_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                file_exitActionPerformed(evt);
            }
        });
    }


    private void file_exitActionPerformed(java.awt.event.ActionEvent evt) {
        exit();
    }

    private void exit() {
        int result = JOptionPane.showConfirmDialog(this, "Do you really want to exit?", "Inforamtion", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (result != JOptionPane.NO_OPTION) {
            dispose();
            System.exit(0);
        }
    }

    private void formWindowClosing(java.awt.event.WindowEvent evt) {
        exit();
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

    private void helpActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showConfirmDialog(this, "Under Construction...", "Inforamtion", JOptionPane.OK_OPTION, JOptionPane.INFORMATION_MESSAGE);
    }

    private void help_aboutActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showConfirmDialog(this, "Under Construction...", "Inforamtion", JOptionPane.OK_OPTION, JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String args[]) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }
}

