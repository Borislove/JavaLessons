package lesson_154;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main {
    public static void main(String[] args) {

        MyFrame m = new MyFrame("My Frame");
        m.addWindowListener(new WindowAdapter() {

            public void windowClosing(WindowEvent e) {
                System.out.println("Close");
                System.exit(0);
            }

            public void windowActivated(WindowEvent e) {
                System.out.println("Activated");
            }

            //после закрытия
            public void windowClossed(WindowEvent e) {
                System.out.println("Clossed");
            }

            public void windowDeactivated(WindowEvent e) {
                System.out.println("Deactivated");
            }

            //свертывание окна
            public void windowIconified(WindowEvent e) {
                System.out.println("Iconified");
            }

            //разворачивание окна
            public void windowDeiconified(WindowEvent e) {
                System.out.println("Deiconified");
            }
            //окно открылось
            public void windowOpened(WindowEvent e) {
                System.out.println("Opened");
            }
        });
    }
}
