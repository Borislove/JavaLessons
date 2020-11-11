package lesson_121;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//Урок №121. Java. Сериализация вложенных объектов
public class MyClass1 implements Serializable {
    public int i;
}

class MyClass2 implements Serializable{
    public MyClass1 m;
}

class SerTest {
    public static void main(String[] args) throws Exception {
        MyClass2 m1 = new MyClass2();
        ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("src\\lesson_121\\My2.ser"));
        o.writeObject(m1);

        o.flush();
        o.close();
    }
}
