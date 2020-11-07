package lesson_56;

//Урок №56. Объекты в качестве аргументов и параметров
public class MyPar {
    int a;
    int b;

    MyPar(int x, int y) {
        a = x;
        b = y;
    }

    boolean eq(MyPar myPar) {
        if (a == myPar.a & b == myPar.b)
            return true;
        else return false;
    }

    public static void main(String[] args) {
        MyPar o1, o2;
        o1 = new MyPar(1, 2);
        o2 = new MyPar(1, 2);

        System.out.println(o1.eq(o2));
    }
}
