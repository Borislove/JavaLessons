//Урок №50. Java. Работа со ссылочными типами
public class Rectangle2 {
    double width;
    double height;

    public static void main(String[] args) {

        Rectangle rect, rect2, rect3;
        rect = new Rectangle();
        rect2 = new Rectangle();
        rect3 = rect;

        rect.width = 10;
        rect.height = 2;

        rect3.width = 4;
        rect3.height = 6;

        rect2.width = 5;
        rect2.height = 3;

        System.out.println("Square 1 = " + (rect.width * rect.height));
        System.out.println("Square 2 = " + (rect2.width * rect2.height));
        System.out.println("Square 3 = " + (rect3.width * rect3.height));
    }
}
