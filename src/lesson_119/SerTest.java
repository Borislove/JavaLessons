package lesson_119;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

//Урок №119. Java. Сериализация. ObjectOutputStream
public class SerTest {
    public static void main(String[] args) throws Exception {

        String str = "My String";

        int[] array = {1, 2, 3};

        ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("src\\lesson_119\\mySer.txt"));

        output.writeObject(str);
        output.writeObject(array);

        output.flush();
        output.close();

        ObjectInputStream input = new ObjectInputStream(new FileInputStream("src\\lesson_119\\mySer.txt"));
        String str1 = (String) input.readObject();
        System.out.println(str1);
    }
}
