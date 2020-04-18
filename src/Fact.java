//Урок №58. Java. Рекурсия

/*
 * n!
 * 1*2...*(n-1) * n
 *
 * 5!
 * 1*2 *3 *4*5 = 120
 *
 * 5! = 4!*5
 * 4! = 3!*4
 * 3! = 2!*3
 * 2! = 1!*2
 * 0! = 1
 * */

public class Fact {

    int factorial(int n) {
        int res;
        System.out.println(n);
        if (n == 1)
            return 1;

        res = factorial(n - 1) * n;
        return res;

    }

    public static void main(String[] args) {
        Fact f = new Fact();
        System.out.println("Number! = " + f.factorial(5));
    }
}
