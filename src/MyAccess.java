//Урок №63. Управление доступом


class Test3 {
    private int a;
    private int d;
    private int c;

    public void setC(int x) {
        c = x;
    }

    public int getC() {
        return c;
    }
}

public class MyAccess {

    public static void main(String[] args) {

        Test3 test3 = new Test3();

        test3.setC(3);
        System.out.println(" = " + test3.getC());
    }
}
