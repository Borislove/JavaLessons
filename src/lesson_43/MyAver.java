package lesson_43;

//Урок №43
public class MyAver { //среднее арифметическое
    public static void main(String[] args) {

        double number[] = {11.1, 12.4, 15, 16.3};
        double result = 0;

        for (int i = 0; i < number.length; i++) {
            result += number[i];
        }
        System.out.println("Sum is " + result);
        System.out.println("Arerage is " + result / number.length);
    }
}

