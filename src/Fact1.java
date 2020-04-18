

public class Fact1 {

    public static void main(String[] args) {

        int fact = 1;
        int number = 5;

        for (int i = number; i >= 1; i--) {
            fact *= i;

        }
        System.out.println("Number! = " + fact);
    }
}
