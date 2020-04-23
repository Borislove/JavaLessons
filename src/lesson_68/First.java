package lesson_68;

//Урок №68. Переопределение методов
public class First {
    int a;
    int b;


    public First(int x, int y) {
        a = x;
        b = y;
    }

    void showVariables() {
        System.out.println("a = " + a + " b = " + b);
    }
}

class Second extends First {
    int c;

    Second(int x, int y, int z) {
        super(x, y);
        c = z;
    }

    void showVariables(int g) {
        super.showVariables();
        System.out.println("c = " + c);
    }
}

class Override {
    public static void main(String[] args) {

        Second s = new Second(1, 2, 3);
        s.showVariables();

        s.showVariables(4);
    }
}