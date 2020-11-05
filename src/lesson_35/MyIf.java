package lesson_35;

//Урок №35. Управляющий оператор if, else
public class MyIf {

    public static void main(String[] args) {

        int a1 = 5;
        int a2 = 1;

        int res;

        if (a2 != 0) {
            res = a1 / a2;
            if (a1 == 5) {
                System.out.println("a1 = 5");
            } else {
                System.out.println("a1!=5");
            }
            System.out.println("Result is " + res);
        } else {
            System.out.println("Error, a2 = 0");
        }
    }
}
