package lesson_63;

public class Test1 {

    int a;
    public int d;
    private int c;

    void setC(int x) {
        c = x;
    }
}

class MyTest1 {
    public static void main(String[] args) {

        Test1 t = new Test1();
        t.a = 1;
        t.d = 2;
        //   t.c = 3;
        t.setC(3);
    }
}
