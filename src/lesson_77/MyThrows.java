package lesson_77;

//Урок №77. Ключевое слово throws
public class MyThrows {

    static void one() throws IllegalAccessException {

        throw new IllegalAccessException("Info");
    }

    public static void main(String[] args) {

        try {
            one();
        } catch (IllegalAccessException e) {
            System.out.println("" + e);
        }
    }
}
