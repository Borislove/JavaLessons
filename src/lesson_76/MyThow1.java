package lesson_76;

public class MyThow1 {

    static void proc() {
        try {
            throw new ArithmeticException("Demo");

        } catch (ArithmeticException e) {
            System.out.println("Our Exception " + e);

            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            proc();
        } catch (ArithmeticException e) {
            System.out.println("Catch in method main " + e);
        }
    }
}
