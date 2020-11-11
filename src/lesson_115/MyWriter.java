package lesson_115;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//Урок №115. Java. Символьные потоки. FileWriter
public class MyWriter {
    public static void main(String[] args) throws IOException {

        //чтение
        FileReader f0 = new FileReader("src\\lesson_108\\MyDir\\App2.java");
        BufferedReader b = new BufferedReader(f0);
        //запись
        FileWriter f = new FileWriter("src\\lesson_115\\writer.txt", true); //на перезапись

        String str = "This is my Writer";

        while ((str = b.readLine()) != null) {

            f.write(str);
        }
        f.close();
        f0.close();
    }
}
