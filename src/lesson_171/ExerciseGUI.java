package lesson_171;


import javax.swing.*;
import javax.swing.text.DefaultCaret;
import javax.swing.text.DefaultHighlighter;
import java.awt.*;
import java.awt.event.KeyEvent;

public class ExerciseGUI extends JInternalFrame {
    private Lessons lessons;
    private int cursor;
    private int progress;
    DefaultHighlighter.DefaultHighlightPainter painter = new DefaultHighlighter.DefaultHighlightPainter(Color.green);

    public ExerciseGUI() {
        initComponents();
        reference_text_area.addKeyListener(this.getKeyListeners()[0]);
        entry_text_area.addKeyListener(this.getKeyListeners()[0]);
        DefaultCaret dc = new DefaultCaret();
        dc.setSize(10, 2);
        dc.setBlinkRate(500);  //мелькание каретки
        dc.setVisible(true);
        entry_text_area.setCaret(dc);
    }

    public void reveal(Lessons lessons) {
        this.lessons = lessons;
        title_label.setText(lessons.get_title());
        descr_label.setText(lessons.get_instructions());
        reference_text_area.setText(lessons.get_text());
        cursor = 0;
        progress = 0;
    }

    private void show_typing_cursor() {
        try {
            reference_text_area.setCaretPosition(cursor);
            reference_text_area.getHighlighter().removeAllHighlights(); //очистили все подсветки
            reference_text_area.getHighlighter().addHighlight(cursor, cursor + 1, painter);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void handle_key_press(char char_struck) {
        handle_key_press_lesson(char_struck);
        if (progress == reference_text_area.getText().length()) {
            JOptionPane.showConfirmDialog(this, "Finish", "Information", JOptionPane.YES_OPTION, JOptionPane.INFORMATION_MESSAGE);
        }
    }

    //обработчик принятой клавиши
    private void handle_key_press_lesson(char char_struck) {
        if (progress < reference_text_area.getText().length()) {
            char char_wanted = reference_text_area.getText().charAt(progress);
            if (char_struck == char_wanted) {
                entry_text_area.append(reference_text_area.getText().substring(progress, progress+1)); // TODO: 26.12.2020
                progress++;
                cursor++;
            } else {
                entry_text_area.append("*");
                progress++;cursor++;
            }
            entry_text_area.setCaretPosition(cursor);
            show_typing_cursor();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        JPanel top_panel = new JPanel();
        toolbar = new JPanel();
        restart_button = new JButton();
        pause_button = new JToggleButton();
        status_panel = new JPanel();
        text_panel = new JPanel();
        dril_panel = new JSplitPane();
        reference_text_area = new JTextArea();
        entry_text_area = new JTextArea();
        label_panel = new JPanel();
        title_label = new JLabel();
        descr_label = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                formKeyPressed(evt);
            }

            public void keyReleased(KeyEvent evt) {
                formKeyReleased(evt);
            }

            public void keyTyped(KeyEvent evt) {
                formKeyTyped(evt);
            }
        });

        restart_button.setText("Restart");

        pause_button.setText("Pause");

        GroupLayout toolbarLayout = new GroupLayout(toolbar);
        toolbar.setLayout(toolbarLayout);
        toolbarLayout.setHorizontalGroup(
                toolbarLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(toolbarLayout.createSequentialGroup()
                                .addComponent(restart_button, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pause_button)
                                .addGap(0, 26, Short.MAX_VALUE))
        );
        toolbarLayout.setVerticalGroup(
                toolbarLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(toolbarLayout.createSequentialGroup()
                                .addGroup(toolbarLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(restart_button, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(pause_button, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 22, Short.MAX_VALUE))
        );

        GroupLayout top_panelLayout = new GroupLayout(top_panel);
        top_panel.setLayout(top_panelLayout);
        top_panelLayout.setHorizontalGroup(
                top_panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, top_panelLayout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(toolbar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(320, 320, 320))
        );
        top_panelLayout.setVerticalGroup(
                top_panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(top_panelLayout.createSequentialGroup()
                                .addContainerGap(35, Short.MAX_VALUE)
                                .addComponent(toolbar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );

        GroupLayout status_panelLayout = new GroupLayout(status_panel);
        status_panel.setLayout(status_panelLayout);
        status_panelLayout.setHorizontalGroup(
                status_panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );
        status_panelLayout.setVerticalGroup(
                status_panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );

        text_panel.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        text_panel.setLayout(new CardLayout(10, 10));

        dril_panel.setOrientation(JSplitPane.VERTICAL_SPLIT);

        reference_text_area.setColumns(20);
        reference_text_area.setRows(5);
        reference_text_area.setEditable(false);  //запрет на редактирование
        reference_text_area.setLineWrap(true);
        reference_text_area.setWrapStyleWord(true);
        dril_panel.setTopComponent(reference_text_area);

        entry_text_area.setEditable(false);
        entry_text_area.setColumns(20);
        entry_text_area.setRows(5);
        entry_text_area.setLineWrap(true);
        entry_text_area.setWrapStyleWord(true);
        dril_panel.setRightComponent(entry_text_area);

        text_panel.add(dril_panel, "card2");

        title_label.setText("title");

        GroupLayout label_panelLayout = new GroupLayout(label_panel);
        label_panel.setLayout(label_panelLayout);
        label_panelLayout.setHorizontalGroup(
                label_panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(label_panelLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(title_label, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(descr_label, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(32, Short.MAX_VALUE))
        );
        label_panelLayout.setVerticalGroup(
                label_panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(label_panelLayout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(label_panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(title_label, GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                                        .addComponent(descr_label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(23, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(status_panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(top_panel, GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(label_panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(180, 180, 180))
                        .addComponent(text_panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(label_panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(top_panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(text_panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                                .addComponent(status_panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19))
        );

        pack();
    }

    private void formKeyTyped(KeyEvent evt) {
        if ((evt.getKeyCode() == KeyEvent.VK_LEFT) || (evt.getKeyCode() == KeyEvent.VK_RIGHT) || (evt.getKeyCode() == KeyEvent.VK_UP) || (evt.getKeyCode() == KeyEvent.VK_DOWN)) {
            entry_text_area.setCaretPosition(cursor);
        }
    }

    private void formKeyPressed(KeyEvent evt) {
        // TODO add your handling code here:
    }

    private void formKeyReleased(KeyEvent evt) {
        //проверка обычной клавиши
        if (!evt.isControlDown()) {
            char key_pressed = evt.getKeyChar();
            int keycode = evt.getKeyCode();
            handle_key_press(key_pressed);
            evt.consume();
        }
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ExerciseGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExerciseGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExerciseGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExerciseGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExerciseGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private JLabel descr_label;
    private JSplitPane dril_panel;
    private JTextArea entry_text_area;
    private JPanel label_panel;
    private JToggleButton pause_button;
    private JTextArea reference_text_area;
    private JButton restart_button;
    private JPanel status_panel;
    private JPanel text_panel;
    private JLabel title_label;
    private JPanel toolbar;
    // End of variables declaration
}
