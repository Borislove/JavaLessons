//Урок №34. Выражения. Приоритет операций
public class MyExp {

    public static void main(String[] args) {

        int i = 2 + 3;
        int j = i + 3 * 2;

        //i = j + 3 + 8;
        System.out.println("Result is " + (i + (i = 3)));
        System.out.println("Result is " + j);
        j = (i + 3) * 2;
    }
}
