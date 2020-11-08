package lesson_83;

import java.util.Enumeration;
import java.util.Hashtable;

//Урок №83. Классы - коллекции. Enumeration
public class MyEnum {
    public static void main(String[] args) {

        Enumeration en;
        String st;
        Hashtable ht = new Hashtable();

        ht.put("Tom", "123456789");
        ht.put("Jon", "4444441444");
        ht.put("Ralf", "1987654321");

        en = ht.keys();

        while (en.hasMoreElements()) {
            st = (String) en.nextElement();
            System.out.println(ht.get(st));
        }
    }
}
