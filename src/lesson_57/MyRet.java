package lesson_57;

//Урок №57. Java. Возврат объектов
public class MyRet {
    int a;
    int b;

    MyRet(int x, int y) {
        a = x;
        b = y;
    }

    MyRet myDouble() {
        MyRet ret = new MyRet(a * 2, b * 2);
        return ret;
    }

    public static void main(String[] args) {
        MyRet r1 = new MyRet(1, 2);
        MyRet r2;

        r2 = r1.myDouble();
        System.out.println("a = " + r1.a + " b = "+r1.b);
        System.out.println("a = " + r2.a + " b = "+r2.b);
    }
}
