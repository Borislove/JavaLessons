package lesson_71;

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

class Test {
    public static void main(String[] args) {

        Second s = new Second();
        s.show();
    }
}