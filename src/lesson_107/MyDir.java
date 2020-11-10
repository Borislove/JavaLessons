package lesson_107;

import java.io.File;

//Урок №107. Java. Работа с каталогами
public class MyDir {
    public static void main(String[] args) {

        File f = new File("C:\\SuperBit");
        //каталог или файл?

        if (f.isDirectory()) {
            String list[] = f.list();
            for (int i = 0; i < list.length; i++) {
                System.out.println(list[i]);

                File f1 = new File("C:\\SuperBit" + "\\" + list[i]);
                System.out.println("Is file " + list[i] + "directory? " + f1.isDirectory());
            }
        }
    }
}
