import java.io.IOException;

//Урок №46
public class MyMenu {
    public static void main(String[] args) throws IOException {


        char choice;
        int a1 = 10;
        int a2 = 2;
        int result;

        do {
            System.out.println("1. +");
            System.out.println("2. -");
            System.out.println("3. *");
            System.out.println("4. /");

            choice = (char) System.in.read();
        } while (choice < '1' || choice > '5');

        switch (choice) {
            case '1':
                result = a1 + a2;
                System.out.println("Result is " + result);
                break;
            case '2':
                result = a1 - a2;
                System.out.println("Result is " + result);
                break;
            case '3':
                result = a1 * a2;
                System.out.println("Result is " + result);
                break;
            case '4':
                result = a1 / a2;
                System.out.println("Result is " + result);
                break;
        }
    }
}
