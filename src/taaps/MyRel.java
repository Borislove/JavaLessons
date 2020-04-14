package taaps;

//операции отношений / сравнение
public class MyRel {

    public static void main(String[] args) {

        int a1 = 10;
        int a2 = 10;

        boolean rezult;
        System.out.println("a1 = " + a1 + " a2 = "+a2);

        rezult = a1 > a2; //больше
        System.out.println("a1 > a2 = " + rezult);

        rezult = a1 < a2; //меньше
        System.out.println("a1 < a2 = " + rezult);

        rezult = a1 == a2; //равно
        System.out.println("a1 == a2 = " + rezult);

        rezult = a1 != a2; //не равно
        System.out.println("a1 != a2 = " + rezult);

        rezult = a1 >= a2; //больше
        System.out.println("a1 >= a2 = " + rezult);

        rezult = a1 <= a2; //больше
        System.out.println("a1 <= a2 = " + rezult);
    }
}
