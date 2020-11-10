package lesson_108;

import java.io.File;
import java.io.FilenameFilter;
//Урок №108. Java. Фильтрация имен файлов
public class MyFilt implements FilenameFilter {

    public boolean accept(File dir, String name){
        return name.endsWith(".txt");  //.html etc
    }
}

class MyDir2{
    public static void main(String[] args) {
        //File f = new File("E:\\MyDir");
        File f = new File("src\\lesson_108\\MyDir");

        FilenameFilter ht = new MyFilt();
        String list[] = f.list(ht);

        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }
}
