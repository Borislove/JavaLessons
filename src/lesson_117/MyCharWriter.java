package lesson_117;

import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

//Урок №117. Java. Символьные потоки. CharArrayWriter
public class MyCharWriter {
    public static void main(String[] args) throws IOException {

        String str = "This is my CharArrayWriter";

        CharArrayWriter f = new CharArrayWriter();

        //char c[] = {'a', 'b', 'c', 'd'};
        char c[] = new char[str.length()];
        str.getChars(0, str.length(), c, 0);
        f.write(c);

        FileWriter f1 = new FileWriter("src\\lesson_117\\MyChar.txt");
        f.writeTo(f1);
        f1.close();
    }
}
