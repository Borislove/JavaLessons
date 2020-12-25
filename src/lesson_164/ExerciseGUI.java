package lesson_164;

import javax.swing.*;

public class ExerciseGUI extends JInternalFrame {

    private JPanel top_panel1;
    private JPanel top_panel;
    private JPanel toolbar;
    private JPanel label_panel;
    private JPanel title_label;
    private JPanel descrt_label;
    private JButton restart_button;
    private JButton pause_button;
    private JPanel status_panel;
    private JPanel text_panel;
    private JSplitPane dril_panel;
    private JTextArea reference_text_area;
    private JTextArea entry_text_area;
    public ExerciseGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        JPanel top_panel = new JPanel();
        toolbar = new JPanel();
        pause_button = new JButton();
        restart_button = new JButton();
        label_panel = new JPanel();
        title_label = new JPanel();
        descrt_label = new JPanel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        pause_button.setText("Pause");

        restart_button.setText("Restart");

        GroupLayout toolbarLayout = new GroupLayout(toolbar);
        toolbar.setLayout(toolbarLayout);
        toolbarLayout.setHorizontalGroup(
                toolbarLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(toolbarLayout.createSequentialGroup()
                                .addComponent(restart_button, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(pause_button)
                                .addGap(0, 8, Short.MAX_VALUE))
        );
        toolbarLayout.setVerticalGroup(
                toolbarLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(toolbarLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(toolbarLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(pause_button, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(restart_button, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)))
        );

        GroupLayout title_labelLayout = new GroupLayout(title_label);
        title_label.setLayout(title_labelLayout);
        title_labelLayout.setHorizontalGroup(
                title_labelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 24, Short.MAX_VALUE)
        );
        title_labelLayout.setVerticalGroup(
                title_labelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 22, Short.MAX_VALUE)
        );

        GroupLayout descrt_labelLayout = new GroupLayout(descrt_label);
        descrt_label.setLayout(descrt_labelLayout);
        descrt_labelLayout.setHorizontalGroup(
                descrt_labelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 27, Short.MAX_VALUE)
        );
        descrt_labelLayout.setVerticalGroup(
                descrt_labelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 23, Short.MAX_VALUE)
        );

        GroupLayout label_panelLayout = new GroupLayout(label_panel);
        label_panel.setLayout(label_panelLayout);
        label_panelLayout.setHorizontalGroup(
                label_panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(label_panelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(title_label, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(37, Short.MAX_VALUE))
                        .addGroup(label_panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(GroupLayout.Alignment.TRAILING, label_panelLayout.createSequentialGroup()
                                        .addContainerGap(35, Short.MAX_VALUE)
                                        .addComponent(descrt_label, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap()))
        );
        label_panelLayout.setVerticalGroup(
                label_panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, label_panelLayout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(title_label, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                        .addGroup(label_panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(GroupLayout.Alignment.TRAILING, label_panelLayout.createSequentialGroup()
                                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(descrt_label, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap()))
        );

        GroupLayout top_panelLayout = new GroupLayout(top_panel);
        top_panel.setLayout(top_panelLayout);
        top_panelLayout.setHorizontalGroup(
                top_panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, top_panelLayout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(toolbar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(label_panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(163, 163, 163))
        );
        top_panelLayout.setVerticalGroup(
                top_panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(top_panelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(top_panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(label_panel, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(toolbar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(20, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(top_panel, GroupLayout.PREFERRED_SIZE, 277, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(top_panel, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        );

        pack();
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
            java.util.logging.Logger.getLogger(ExerciseGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExerciseGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExerciseGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExerciseGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExerciseGUI().setVisible(true);
            }
        });
    }
}
