package lesson_88;

//Урок №88. Java. Классы-оболочки. Class
public class MyClass {
    public static void main(String[] args) {

        Class c1 = null, c2 = null;

        String s = "String";

        c1 = s.getClass();
        try {
            c2 = Class.forName("java.lang.String");

            System.out.println("Is primitive "+c1.isPrimitive());
            System.out.println("Package "+c1.getPackage());
            System.out.println("Superclass "+c1.getSuperclass());
        }catch (Exception e){

        }
    }
}

//должны получить полную информацию по классу