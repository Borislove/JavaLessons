package lesson_120;

import java.io.*;

//Урок №120. Java. Восстановление объектов в памяти
public class MyClass implements Serializable {
    private int i;

    public void setI(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }
}

class DemoSer {
    public static void main(String[] args) throws Exception {
        MyClass m = new MyClass();
        m.setI(10);
        ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("src\\lesson_120\\myclass.ser"));
        o.writeObject(m);
        o.flush();
        o.close();

        ObjectInputStream i = new ObjectInputStream(new FileInputStream("src\\lesson_120\\myclass.ser"));
        MyClass m1 = (MyClass) i.readObject();

        i.close();
        System.out.println(m1.getI());
    }
}
