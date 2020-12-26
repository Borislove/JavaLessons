package lesson_167;

import javax.swing.*;
import java.awt.*;

//Урок №167. Усовершенствование графического интерфейса
public class MainWindow extends javax.swing.JFrame {
    private ExerciseGUI exercise;

    public MainWindow() {
        initComponents();
        exercise = new ExerciseGUI();
        exercise.pack();
        exercise.validate();
        exercise.reveal(new Lessons("Lesson 1", "Please type", "fjkdjklljjjsdaflqiiidjjklas"));
        jDesktopPane1.add(exercise);
        exercise.setResizable(true);
        exercise.setVisible(true);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        menu_bar = new javax.swing.JMenuBar();
        file_menu = new javax.swing.JMenu();
        file_exit = new javax.swing.JMenuItem();
        help_menu = new javax.swing.JMenu();
        help_about = new javax.swing.JMenuItem();
        help = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setPreferredSize(new java.awt.Dimension(630, 520));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }

            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
                jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 463, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
                jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 310, Short.MAX_VALUE)
        );

        file_menu.setMnemonic('F');
        file_menu.setText("File");
        file_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                file_menuActionPerformed(evt);
            }
        });

        file_exit.setText("Exit");
        file_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                file_exitActionPerformed(evt);
            }
        });
        file_menu.add(file_exit);

        menu_bar.add(file_menu);

        help_menu.setMnemonic('H');
        help_menu.setText("Help");

        help_about.setText("About");
        help_about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                help_aboutActionPerformed(evt);
            }
        });
        help_menu.add(help_about);

        help.setText("Help");
        help.setToolTipText("");
        help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpActionPerformed(evt);
            }
        });
        help_menu.add(help);

        menu_bar.add(help_menu);

        setJMenuBar(menu_bar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>

    private void file_menuActionPerformed(java.awt.event.ActionEvent evt) {


    }


    private void file_exitActionPerformed(java.awt.event.ActionEvent evt) {
        exit();
    }

    private void formWindowClosed(java.awt.event.WindowEvent evt) {

    }

    private void formWindowClosing(java.awt.event.WindowEvent evt) {
        exit();
    }

    private void helpActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showConfirmDialog(this, "Under Construction...", "Inforamtion", JOptionPane.OK_OPTION, JOptionPane.INFORMATION_MESSAGE);
    }

    private void help_aboutActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showConfirmDialog(this, "Under Construction...", "Inforamtion", JOptionPane.OK_OPTION, JOptionPane.INFORMATION_MESSAGE);
    }

    private void exit() {
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

    // Variables declaration - do not modify
    private javax.swing.JMenuItem file_exit;
    private javax.swing.JMenu file_menu;
    private javax.swing.JMenuItem help;
    private javax.swing.JMenuItem help_about;
    private javax.swing.JMenu help_menu;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenuBar menu_bar;
    // End of variables declaration
}
