package lesson_58;

//факториал
/*
 * n!
 * 1*2...*(n-1) * n
 *
 * 5!
 * 1*2*3*4*5 = 120
 *
 * 5! = 4! * 5
 * 4! = 3! * 4
 * 3! = 2! * 3
 * 2! = 1! * 2
 * 0! = 1
 * */

public class Factorial {

    int factorial(int n) {
        int res;
        System.out.println(n);
        if (n == 1) return 1;
        res = factorial(n - 1) * n;
        return res;
    }

    public static void main(String[] args) {

        Factorial fact = new Factorial();

        //итерационный метод
       /* int fact = 1;
        int number = 5;
        for (int i = number; i >= 1; i--) {
            fact *= i;
        }*/
        System.out.println("Number! = " + fact.factorial(5));
    }
}
