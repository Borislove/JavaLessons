package lesson_123;

//Урок №123. Запуск подпроцессов. Интерфейс Runnable
public class Thread2 implements Runnable {

    String str;

    Thread2(String str) {
        this.str = str;
    }

    public void run(){
        for (int i = 0; i <30 ; i++)
            System.out.println(str);
    }

    public static void main(String[] args) {
        new Thread(new Thread2("One")).start();
        new Thread(new Thread2("Two")).start();
    }
}


