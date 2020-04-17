//Урок №37. Оператор цикла for
public class MyFor {
    public static void main(String[] args) {

        int a;
        int b;
        for (a = 1, b = 5; a < b; a++, b--) {
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }
        System.out.println("Finish");
    }
}
