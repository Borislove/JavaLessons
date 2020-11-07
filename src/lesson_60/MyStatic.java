package lesson_60;

//Урок №60. Java. Статические элементы
public class MyStatic {

    static int a = 3;

    static void out() {
        System.out.println("a = " + a);
    }
}

class StatTest {
    public static void main(String[] args) {
        MyStatic.out();
    }
}
