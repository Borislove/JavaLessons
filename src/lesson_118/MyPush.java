package lesson_118;

import java.io.CharArrayReader;
import java.io.IOException;
import java.io.PushbackReader;

//Урок №118. Java. Символьные потоки. PushBackReader
public class MyPush {
    public static void main(String[] args) throws IOException {

        String str = "My String";

        char buffer[] = new char[str.length()];

        str.getChars(0, str.length(), buffer, 0);
        CharArrayReader input = new CharArrayReader(buffer);

        PushbackReader f = new PushbackReader(input);

        int r;
        r = f.read(); //прочитали
        System.out.println((char)r);
        //f.unread(r); //вернули в поток

        r = f.read();
        System.out.println((char)r);
    }
}
