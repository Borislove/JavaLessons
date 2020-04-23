package lesson_69;

//Урок №69. Динамическая диспетчеризация методов
public class First {

    void show() {
        System.out.println("First");
    }
}

class Second extends First {

    void show() {
        System.out.println("Second");
    }
}

class MyDis {
    public static void main(String[] args) {

        First f = new First();
        Second s = new Second();

        First d;

        d = f;
        d.show();

        d = s;
        d.show();
    }
}