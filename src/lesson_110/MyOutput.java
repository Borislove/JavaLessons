package lesson_110;

import java.io.FileOutputStream;
import java.io.OutputStream;

//Урок №110. Java. Файловые потоки. FileOutputStream
public class MyOutput {

    public static byte[] getInput() throws Exception {

        byte mybuf[] = new byte[10];

        for (int i = 0; i < 10; i++) {
            mybuf[i] = (byte) System.in.read();
        }

        return mybuf;
    }

    public static void main(String[] args) throws Exception {

        byte[] buffer = getInput();

        OutputStream f = new FileOutputStream("my.txt");

        f.write(buffer);
        f.close();
    }
}
