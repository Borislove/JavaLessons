package lesson_114;

//Урок №114. Java. Символьные потоки. FileReader

import java.io.BufferedReader;
import java.io.FileReader;

/*
 * Reader
 * Writer
 * */
public class MyReader {
    public static void main(String[] args) throws Exception {
        FileReader f = new FileReader("src\\lesson_108\\MyDir\\App2.java");

        BufferedReader b = new BufferedReader(f);
        //вывести 1 строку
        System.out.println(b.readLine());

        //чтение пока есть строчки
        String str;
        while ((str = b.readLine()) != null) {
            System.out.println(str);
        }
    }
}
