package lesson_53;

//Урок №53. Java. Конструкторы
public class MyRec {
    double width;
    double height;

    public MyRec(double w, double h) {
        width = w;
        height = h;
    }

    public static void main(String[] args) {
        MyRec rec = new MyRec(10,2);
        MyRec rec2 = new MyRec(5,3);
        System.out.println("Width = " + rec.width + " Height = " + rec.height);
        System.out.println("Width 2 = " + rec2.width + " Height 2 = " + rec2.height);
    }
}
