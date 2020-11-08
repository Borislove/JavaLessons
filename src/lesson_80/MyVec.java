package lesson_80;

import java.util.Vector;

//Урок №80. Vector
// java MyVec 1 2 3 4
public class MyVec {

    public static void main(String[] args) {

        Vector v = new Vector();

        for (int i = 0; i < args.length; i++) {
            v.add(args[i]);
        }

        v.set(2, "5");
        v.remove("5");

        for (int i = 0; i < v.size(); i++) {
            System.out.println("Element " + v.get(i));
        }

        System.out.println("Index " + v.indexOf("5"));
    }
}
