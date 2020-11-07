package lesson_49;

//Урок №49. Java. Переменные экземпляров
public class Rectangle {
    double width;
    double height;

    public static void main(String[] args) {

        Rectangle rect, rect2;
        rect = new Rectangle();
        rect2 = new Rectangle();

        rect.width = 10;
        rect.height = 2;

        rect2.width = 5;
        rect2.height = 3;

        System.out.println("Square 1 = " + (rect.width * rect.height));
        System.out.println("Square 2 = " + (rect2.width * rect2.height));
    }
}