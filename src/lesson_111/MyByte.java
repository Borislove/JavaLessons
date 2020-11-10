package lesson_111;

import java.io.ByteArrayInputStream;

//Урок №111. Java. Файловые потоки. ByteArrayInputStream
public class MyByte {
    public static void main(String[] args) {

        String s = "My ByteArrayInputStream";

        byte[] myStr = s.getBytes();

        ByteArrayInputStream in = new ByteArrayInputStream(myStr);

        int r;
        while((r=in.read()) !=-1){
            System.out.print((char)r);
        }
    }
}
