package lesson_65;

//Урок №65. Наследование и управление доступом
public class First {

    int x;
    int y;
}

class Second extends First {

    int k;

    int getY() {
        return y;
    }
}

class CheckAccess {

    public static void main(String[] args) {

        First f = new First();
        Second s = new Second();
        f = s;

        s.getY();
    }
}
