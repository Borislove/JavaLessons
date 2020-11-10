package lesson_112;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

//Урок №112. Java. Файловые потоки. ByteArrayOutputStream
public class MyB {
    public static void main(String[] args) throws IOException {

        ByteArrayOutputStream f = new ByteArrayOutputStream(10);
        while (f.size() != 5) {
            f.write(System.in.read());
        }
        System.out.println(f.toString());

        OutputStream f1 = new FileOutputStream("MyFile.txt");
        f.writeTo(f1);
        f1.close();
    }
}
