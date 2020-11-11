package lesson_122;

//Урок №122. Запуск подпроцессов. Класс Thread
public class MyThread extends Thread {

    String str;

    MyThread(String str) {
        this.str = str;
    }

    public void run() {
        for (int i = 0; i < 30; i++)
            System.out.print(str);
    }
}

class TestThreads {
    public static void main(String[] args) {
        new MyThread("ONE").start();
        new MyThread("TWO").start();
    }
}