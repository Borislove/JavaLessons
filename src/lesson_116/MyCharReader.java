package lesson_116;

import java.io.CharArrayReader;

//Урок №116. Java. Символьные потоки. CharArrayReader
public class MyCharReader {
    public static void main(String[] args) throws Exception {

        String str = "This is CharArrayReader";
        //char c[] = {'a', 'b', 'c', 'd'};
        char c[] = new char[str.length()];
        str.getChars(0,str.length(),c,0);
        CharArrayReader input = new CharArrayReader(c);

        int res;
        while ((res = input.read()) != -1) {
            System.out.println((char) res);
        }
    }
}
