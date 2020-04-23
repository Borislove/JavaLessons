//Урок №64. Вложенные и внутренние классы
public class Out {
    private int x;

    void runInner() {
        In n = new In();
        n.showX();
    }

    class In {
        void showX() {
            System.out.println(" x = " + x);
        }
    }
}

class Innertest {
    public static void main(String[] args) {

        Out o = new Out();
        o.runInner();
    }
}

