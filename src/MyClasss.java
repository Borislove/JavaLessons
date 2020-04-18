public class MyClasss {
    int a;
    int b;

    public MyClasss(int x, int y) {
        a = x;
        b = y;
    }

    MyClasss(int x) {
        a = b = x;
    }

    void out() {
        System.out.println("a = " + a + " b = " + b);
    }

    public static void main(String[] args) {
        MyClasss c1, c2, c3;
        c1 = new MyClasss(1, 2);
        c2 = new MyClasss(3);
        c3 = new MyClasss(4, 5);

        c1.out();
        c2.out();
        c3.out();
    }
}
