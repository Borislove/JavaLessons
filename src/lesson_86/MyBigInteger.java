package lesson_86;

import java.math.BigInteger;

public class MyBigInteger {
    public static void main(String[] args) {

        BigInteger bi = new BigInteger("111111111111111111111111111111");

        BigInteger ai = new BigInteger("555555555555555555555555555555");

        System.out.println("Length is " + bi.bitLength());

        System.out.println("Sum = "+bi.add(ai));

        System.out.println("Max = "+ bi.max(ai));
    }
}
