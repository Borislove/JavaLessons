package lesson_67;

//Урок №67. Многоуровневая иерархия.
public class First {
    First() {
        System.out.println("First");
    }
}

class Second extends First {
    Second() {
        System.out.println("Second");
    }
}

class Third extends Second {
    public Third() {
        System.out.println("Third");
    }
}

class Call {

    public static void main(String[] args) {
        Third t = new Third();

        System.out.println("*****");

        Second s = new Second();
    }
}
