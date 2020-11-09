package lesson_93;

//Lesson 93 Переменные в интерфейсах
public interface Constants {
    int NO = (int)(Math.random()*10);
    int YES = (int)(Math.random()*10);
}

class MyClass implements  Constants{
    public static void main(String[] args) {

         int i = 0;

         if(i == NO) System.out.println("NO");
         else System.out.println("YES");
    }
}
