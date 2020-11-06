package lesson_42;

//Урок №42. Java. Приведение типов
public class MyConv {
    public static void main(String[] args) {

        long a = 10000000000000L;
        int l = (int) a;
        System.out.println(a);

        System.out.println(String.valueOf(a).length());
        System.out.println(String.valueOf(10000000000000L).length());

        double b = 23.45;
        int g = (int) b; //усечение
        System.out.println(g);

        byte b1 = 50;
        byte b2 = 20;
        byte b3 = 127;

        int result = b1 * b2 * b3;
        System.out.println(result);
        
        byte b4 = 50;
        byte b5 = (byte) (b4*2);
        System.out.println("b5 = " + b5);
    }
}
