package lesson_49;

//Урок №51. Java. Методы класса
public class Rectangle3 {
    double width;
    double height;

    double square() {
        return width * height;
    }

    public static void main(String[] args) {

        Rectangle3 rect, rect2, rect3;

        rect = new Rectangle3();
        rect2 = new Rectangle3();
        rect3 = rect;

        rect.width = 10;
        rect.height = 2;

        rect3.width = 4;
        rect3.height = 4;

        rect2.width = 5;
        rect2.height = 3;

        System.out.println("Square = " + rect.square());
    }
}
