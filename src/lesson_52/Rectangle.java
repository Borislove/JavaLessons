package lesson_52;

//Урок №52. Методы класса с параметрами
public class Rectangle {
    double width;
    double height;

    double square() {
        return width * height;
    }

    void setValues(double w, double h) {
        width = w;
        height = h;
    }

    public static void main(String[] args) {

        Rectangle rect, rect2, rect3;

        rect = new Rectangle();
        rect2 = new Rectangle();
        rect3 = rect;

        rect.setValues(10, 2);
        rect2.setValues(5, 3);
        System.out.println("Square 1 = " + rect.square());
        System.out.println("Square 2 = " + rect2.square());
    }
}

