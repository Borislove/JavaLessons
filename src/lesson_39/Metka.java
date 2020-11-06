package lesson_39;

//метки
public class Metka {

    public static void main(String[] args) {

        second:
        for (int j = 0; j < 8; j++) {
            first:
            for (int i = 0; i < 8; i++) {
                if (i == 5) break first;
                System.out.println("i = " + i);
            }
            System.out.println("j = " + j);
        }
    }
}
