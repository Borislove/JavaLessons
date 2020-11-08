package lesson_75;

public class MyTry {
    public static void main(String[] args) {

        try {

            int l = args.length;
            int a = 10 / l;

            try {
                if (l == 1) l = l / (l - 1);  //0

                if (l == 2) args[10] = "10";
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Index out of Bounds " + e);
            }
        } catch (ArithmeticException e) {
            System.out.println("/ by zero" + e);
        }
    }
}
