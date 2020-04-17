public class MyAver2 {
    public static void main(String[] args) {

        double numbers[];
        numbers = new double[4];
        numbers[0] = 11.1;
        numbers[1] = 12.4;
        numbers[2] = 15;
        numbers[3] = 16.3;

        double result = 0;

        for (int i = 0; i < numbers.length; i++) {
            result += numbers[i];
        }
        System.out.println("Sum is " + result);
    }
}

