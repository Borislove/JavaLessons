package lesson_27;

public class MyCh {

    public static void main(String[] args) {

        char ch1 = 'A';
        System.out.println("My character is " + ch1);

        char ch2 = 41;
        // System.out.println(ch2);

        ch2--;
        System.out.println(ch2);
        ch2++;
        System.out.println(ch2);

        for (int i = 0; i < 15 ; i++) {
            System.out.println(ch2);
            ch2++;

        }
    }
}
