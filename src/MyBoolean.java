//#25 Логический тип данных, логические операции
public class MyBoolean {

    public static void main(String[] args) {

        boolean b1 = true;  //истина
        boolean b2 = false; //ложь

        System.out.println("NOT (!) !b1 = " + (!b1));   //отрицание

        System.out.println("AND (&) b1&b2 = " + (b1 & b2));  //false

        b2 = !b2;
        System.out.println(b1 & b2);  //true

        b2 = !b2;
        System.out.println(b1 & b2);  //false
        System.out.println("OR (|) b1|b2 = " + (b1 | b2));

        System.out.println(b1 + " " + b2);
        System.out.println("XOR (^) b1^b2 = " + (b1 ^ b2)); //исключающее или

    }
}

