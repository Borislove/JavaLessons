package lesson_124;

//Урок №124. Java. Остановка подпроцессов
public class Thread3 implements Runnable {

    String str;
    Thread go;

    Thread3(String str) {
        this.str = str;
        go = new Thread(this);
        go.start();
    }

    public void run() {
        Thread t = Thread.currentThread();
        while (go == t) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
            System.out.println(str);
        }
        System.out.println("End");
    }

    public void stop() {
        go = null;
    }

    public static void main(String[] args) throws Exception {
        Thread3 t1 = new Thread3("One");
        Thread3 t2 = new Thread3("Two");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        t1.stop();
        t2.stop();
    }
}

