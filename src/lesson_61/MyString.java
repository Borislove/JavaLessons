package lesson_61;

//Урок №61.Класс String. Метод main
public class MyString {

    public static void main(String[] args) {

        String st = "lesson_54.Info";
        String st2 = "lesson_54.Info";
        String st1 = "It" + " is" + " my" + " string";

        System.out.println(st);
        System.out.println(st1);
        System.out.println("Finish");

        System.out.println("Result is " + st.equals(st1));

        System.out.println("Result is " + st.equals(st2));

        System.out.println("Result is " + st2.length());

        String str[] = {"one", "two"};
        System.out.println("Result is " + str[0]);
        System.out.println("Result is " + str[1]);

/*
        System.out.println("Rsult is " + args[0]);
        System.out.println("Rsult is " + args[1]);*/
    }
}
