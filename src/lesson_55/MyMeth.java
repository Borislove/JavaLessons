package lesson_55;

//Урок №55. Java. Перегрузка методов и конструкторов
public class MyMeth {
    int a;
    int b;

    void setVariables(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void setVariables(int a) {
        this.a = a;
        this.b = a;
    }

    void out() {
        System.out.println(" a = " + a + " b = " + b);
    }

    public static void main(String[] args) {
        MyMeth ob = new MyMeth();
        ob.setVariables(3);
        ob.out();
        ob.setVariables(1, 2);
        ob.out();
    }
}
