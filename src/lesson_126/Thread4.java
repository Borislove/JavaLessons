package lesson_126;

//Урок №126. Пример синхронизации подпроцессов
public class Thread4 implements Runnable {

    // synchronized public void run() {   //будет синхронизация
    public void run() {
        System.out.print("Hello, ");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {

        }
        System.out.println("Java");
    }

    public static void main(String[] args) {
        Thread4 t = new Thread4();
        new Thread(t).start();
        new Thread(t).start();
    }
}
