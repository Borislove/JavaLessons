package lesson_106;

import java.io.File;

//Урок №106. Java. Работа с файлами. Класс File
public class MyFile {
    public static void main(String[] args) {

        //File f = new File("E;\\");
        File f = new File("C:\\", "autoexec.bat");
        System.out.println("File name: " + f.getName());

        //получить информацию о файле, существует ли?
        System.out.println("Exists? " + f.exists());

        //доступен ли файл для записи
        System.out.println("Is Writeable" + f.canWrite());
    }
}
