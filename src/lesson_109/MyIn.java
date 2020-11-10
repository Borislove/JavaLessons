package lesson_109;

import java.io.FileInputStream;

//Урок №109. Java. Файловые потоки. FileInputStream
public class MyIn {
    public static void main(String[] args) throws Exception {

        FileInputStream f = new FileInputStream("src\\lesson_108\\MyDir\\App2.java");

        System.out.println("Size = " + f.available());

        System.out.println((char) f.read()); // Size =159
        f.skip(1);
        System.out.println("Size 2 = " + f.available()); //размер в байтах

        System.out.println((char) f.read());
        System.out.println("Size 3 = " + f.available());
        f.close();
    }
}
