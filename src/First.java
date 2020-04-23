//Урок №62. Наследование
public class First {

    int x, y;

    void show() {
        System.out.println("x = " + x + " y = " + y);
    }
}

class Second extends First {

    int z;

    void showZ() {
        System.out.println("z = " + z);
    }
}

class Test1 {
    public static void main(String[] args) {

        First f = new First();
        Second s = new Second();

        f.x = 1;
        f.y = 2;
        f.show();

        s.x = 3;
        s.y = 4;
        s.show();

        s.z = 5;
        s.showZ();
    }
}