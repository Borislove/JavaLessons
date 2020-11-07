package lesson_51;

//Урок №51. Методы класса
public class Rectangle {
    double width;
    double height;

   /* void square() {
        System.out.println("Square  = " + (width * height));
    }*/

    double square() {
        return width * height;
    }

    public static void main(String[] args) {

        Rectangle rect, rect2, rect3;

        double sq;

        rect = new Rectangle();
        rect2 = new Rectangle();
        rect3 = rect;

        rect.width = 10;
        rect.height = 2;

        rect3.width = 4;
        rect3.height = 4;

        rect2.width = 5;
        rect2.height = 3;

        //  sq = rect.square();
        //  System.out.println("Square = "+sq);
        System.out.println("Square = " + rect.square());
    }
}

