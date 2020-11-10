package lesson_113;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;

//Урок №113. Java.Буферизированные байтовые потоки
public class Test {
    public static void main(String[] args) throws IOException {

        String st = "My String";
        byte buffer[] = st.getBytes();

        ByteArrayInputStream f = new ByteArrayInputStream(buffer);

        BufferedInputStream f1 = new BufferedInputStream(f);

        int r;
        while ((r = f1.read()) != -1) {
            if ((char) r == 'S') f1.mark(st.length());
        }
        f1.reset();
        r = f1.read();
        System.out.println(r);
    }
}

