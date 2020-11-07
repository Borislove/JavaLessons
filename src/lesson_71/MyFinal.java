package lesson_71;

//Урок №71. Спецификатор final
public class MyFinal {

    final int MAX = 2;

    boolean equals(int x) {

        if (x == MAX) return true;
        else return false;
    }

    public static void main(String[] args) {
        MyFinal mf = new MyFinal();
        System.out.println("Result is " + mf.equals(2));
    }
}
