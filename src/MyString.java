
//Урок №61.Класс String. Метод main
public class MyString {

    public static void main(String[] args) {

        String st = "Test";
        String st2 = "Test";
        String st1 = "It" + " is" + " my" + " string";

        System.out.println(st);
        System.out.println(st1);
        System.out.println("Finish");

        System.out.println("Rsult is " + st.equals(st1));

        System.out.println("Rsult is " + st.equals(st2));

        System.out.println("Rsult is " + st2.length());

        String str[] = {"one", "two"};
        System.out.println("Rsult is " + str[0]);
        System.out.println("Rsult is " + str[1]);

/*
        System.out.println("Rsult is " + args[0]);
        System.out.println("Rsult is " + args[1]);*/
    }
}
