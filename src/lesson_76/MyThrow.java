package lesson_76;

//Урок №76. Оператор throw
public class MyThrow {

    static void proc() {
        throw new ArithmeticException("Demo");
        //System.out.println("After new Exception");
    }

    public static void main(String[] args) {
        proc();
    }
}
