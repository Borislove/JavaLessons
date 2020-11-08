package lesson_87;

import java.math.BigDecimal;
import java.math.BigInteger;

public class MyBig {
    public static void main(String[] args) {

        /*
         * 76.56789
         *
         * 5
         * */

        BigDecimal a = new BigDecimal("345.7896e-4");

        BigDecimal b = new BigDecimal(new BigInteger("256789"), 4);

        System.out.println("Sum = " + a.add(b));

        System.out.println(" a / b = " + a.divide(b, BigDecimal.ROUND_UP)); //с округлением
        System.out.println(" a / b = " + a.divide(b, BigDecimal.ROUND_DOWN));

        System.out.println(" = "+a.scale()); //масштаб
    }
}
