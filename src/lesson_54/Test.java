package lesson_54;

//Урок №54. Ключевое слово this
public class Test {
    int a;
    int b;

    void setAB(int a, int b) {
        this.a = a; //работа с полями класса
        this.b = b;
        System.out.println(" a = " + a + " b = " + b);
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.setAB(2, 3);

        System.out.println(" a = " + t.a + " b = " + t.b);
    }
}
