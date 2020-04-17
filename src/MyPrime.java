//Урок №45
public class MyPrime {
    public static void main(String[] args) {

        int number;
        boolean isPrime = true;

        number = 11;

        for (int i = 2; i < number; i++) {
            if ((number % i) == 0) {
                isPrime = false;
                break;
            }
        }
        if(isPrime)
            System.out.println("Prime number");

        else System.out.println("Is not prime number");
    }
}
