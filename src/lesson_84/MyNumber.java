package lesson_84;

//java MyNumber 55
/*
 * Integer
 * Short
 * Double
 * Byte
 * Long
 * Float
 * BigDecimal
 * BigInteger
 *
 * */
//Классы обёртки
public class MyNumber {
    public static void main(String[] args) {

        int i = 0;
        double d = 0;
        short s = 0;

        i = Integer.parseInt(args[0]);
        d = Double.parseDouble(args[0]);
        s = Short.parseShort(args[0]);

        Integer i1 = new Integer(i);

        System.out.println("i = " + i);
        System.out.println("d = " + d);
        System.out.println("s = " + s);
    }
}
