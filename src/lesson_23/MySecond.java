package lesson_23;

//MyNumber n+ progam
//Примеры с пробелами
//#23
//MyNumber second program
public class MySecond {

    public static void newLine() {
        System.out.println("\n");
        System.out.println("--------------");
    }

    public static void main(String[] args) {

        System.out.print("Hello ");
        System.out.print("World!");
        newLine();

        //---------------------------------

        System.out.print("Hello");
        System.out.print(" World!");
        newLine();

        //---------------------------------

        System.out.print("Hello");
        System.out.print(" ");
        System.out.print("World!");
        newLine();

        //---------------------------------управляющие последовательности

        System.out.println("Hello\nWorld!");  //перевод строки
        newLine();


        System.out.println("Hello\tWorld!");  //табуляция
        newLine();

        System.out.println("Hello\\World");  //вывод слэша
        newLine();

        System.out.println("Hello\"World\"");  //кавычки
    }
}


