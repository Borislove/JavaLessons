//Урок №33. Операция присваивания. Условная операция
public class MyAssign {    

    public static void main(String[] args) {

        int a = 5;

        int b, c, d;
        System.out.println("a = " + a);
        a = 4;
        System.out.println("a = " + a);
        a +=3; //
        System.out.println("a = " + a);
        a = 0;
        System.out.println("a = " + a);
        b = c = d = 100;
        System.out.println("b = " + b + " c = " + c + " d = "+ d);
    }
}
