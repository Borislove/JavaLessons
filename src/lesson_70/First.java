package lesson_70;

//Урок №70. Абстрактные классы
abstract class First {
    abstract void show();

    void showText() {
        System.out.println("First");
    }
}

class Second extends First {

    void show() {
        System.out.println("Second");
    }
}

class MyAbstract {
    public static void main(String[] args) {
        First f;
        Second s = new Second();

        s.show();
        s.showText();

        f = s;
        f.show();
        f.showText();
    }
}