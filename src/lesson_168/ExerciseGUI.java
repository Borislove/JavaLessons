package lesson_168;


import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import java.awt.*;

public class ExerciseGUI extends javax.swing.JInternalFrame {
    private Lessons lessons;
    private int cursor;
    private int progress;
    DefaultHighlighter.DefaultHighlightPainter painter = new DefaultHighlighter.DefaultHighlightPainter(Color.ORANGE);

    public ExerciseGUI() {
        initComponents();
    }

    public void reveal(Lessons lessons) {
        this.lessons = lessons;
        title_label.setText(lessons.get_title());
        descr_label.setText(lessons.get_instructions());
        reference_text_area.setText(lessons.get_text());
        cursor = 0;
        progress = 0;
    }

    private void show_typing_cursor() throws BadLocationException {
        reference_text_area.setCaretPosition(cursor);
        reference_text_area.getHighlighter().removeAllHighlights(); //очистили все подсветки
        reference_text_area.getHighlighter().addHighlight(cursor,cursor+1,painter);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        javax.swing.JPanel top_panel = new javax.swing.JPanel();
        toolbar = new javax.swing.JPanel();
        restart_button = new javax.swing.JButton();
        pause_button = new javax.swing.JToggleButton();
        status_panel = new javax.swing.JPanel();
        text_panel = new javax.swing.JPanel();
        dril_panel = new javax.swing.JSplitPane();
        reference_text_area = new javax.swing.JTextArea();
        entry_text_area = new javax.swing.JTextArea();
        label_panel = new javax.swing.JPanel();
        title_label = new javax.swing.JLabel();
        descr_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        restart_button.setText("Restart");

        pause_button.setText("Pause");

        javax.swing.GroupLayout toolbarLayout = new javax.swing.GroupLayout(toolbar);
        toolbar.setLayout(toolbarLayout);
        toolbarLayout.setHorizontalGroup(
                toolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(toolbarLayout.createSequentialGroup()
                                .addComponent(restart_button, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pause_button)
                                .addGap(0, 26, Short.MAX_VALUE))
        );
        toolbarLayout.setVerticalGroup(
                toolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(toolbarLayout.createSequentialGroup()
                                .addGroup(toolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(restart_button, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(pause_button, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout top_panelLayout = new javax.swing.GroupLayout(top_panel);
        top_panel.setLayout(top_panelLayout);
        top_panelLayout.setHorizontalGroup(
                top_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, top_panelLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(toolbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(320, 320, 320))
        );
        top_panelLayout.setVerticalGroup(
                top_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(top_panelLayout.createSequentialGroup()
                                .addContainerGap(35, Short.MAX_VALUE)
                                .addComponent(toolbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout status_panelLayout = new javax.swing.GroupLayout(status_panel);
        status_panel.setLayout(status_panelLayout);
        status_panelLayout.setHorizontalGroup(
                status_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );
        status_panelLayout.setVerticalGroup(
                status_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );

        text_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        text_panel.setLayout(new java.awt.CardLayout(10, 10));

        dril_panel.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        reference_text_area.setColumns(20);
        reference_text_area.setRows(5);
        reference_text_area.setEditable(false);  //запрет на редактирование
        reference_text_area.setLineWrap(true);
        reference_text_area.setWrapStyleWord(true);
        dril_panel.setTopComponent(reference_text_area);

        entry_text_area.setEditable(true);
        entry_text_area.setColumns(20);
        entry_text_area.setRows(5);
        entry_text_area.setLineWrap(true);
        entry_text_area.setWrapStyleWord(true);
        dril_panel.setRightComponent(entry_text_area);

        text_panel.add(dril_panel, "card2");

        title_label.setText("title");

        javax.swing.GroupLayout label_panelLayout = new javax.swing.GroupLayout(label_panel);
        label_panel.setLayout(label_panelLayout);
        label_panelLayout.setHorizontalGroup(
                label_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(label_panelLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(title_label, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(descr_label, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(32, Short.MAX_VALUE))
        );
        label_panelLayout.setVerticalGroup(
                label_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(label_panelLayout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(label_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(title_label, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                                        .addComponent(descr_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(status_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(top_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(label_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(180, 180, 180))
                        .addComponent(text_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(label_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(top_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(text_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                                .addComponent(status_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ExerciseGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExerciseGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExerciseGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExerciseGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExerciseGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JLabel descr_label;
    private javax.swing.JSplitPane dril_panel;
    private javax.swing.JTextArea entry_text_area;
    private javax.swing.JPanel label_panel;
    private javax.swing.JToggleButton pause_button;
    private javax.swing.JTextArea reference_text_area;
    private javax.swing.JButton restart_button;
    private javax.swing.JPanel status_panel;
    private javax.swing.JPanel text_panel;
    private javax.swing.JLabel title_label;
    private javax.swing.JPanel toolbar;
    // End of variables declaration
}
