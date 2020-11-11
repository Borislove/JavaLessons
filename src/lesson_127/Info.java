package lesson_127;

//Урок №127. Совместный доступ к объектам (Часть 1)

/*
 * wait()
 * notify()
 * notifyAll
 * */
public class Info {

    int info = -1;

    boolean ready;

    synchronized public int getInfo() {
        try {
            if (!ready) wait(); //режим спячки
            ready = false;
            return info;

        } catch (InterruptedException e) {
        } finally {
            notify();
        }
        return -1;
    }

    synchronized public void setInfo(int n) {
        if (ready)
            try {
                wait();
            } catch (InterruptedException e) {
            }

        info = n;
        ready = true;
        notify();
    }
}

class MyWriter implements Runnable {

    Info in;
    Thread go;

    MyWriter(Info in) {
        this.in = in;
        go = new Thread(this);
        go.start();
    }

    public void run() {
        int n = 0;
        Thread t = Thread.currentThread();
        while (go == t) {
            in.setInfo(n);
            System.out.print("Write " + n);
            n++;
        }
    }

    public void stop() {
        go = null;
    }
}


class MyReader implements Runnable {

    Info in;
    Thread go;

    MyReader(Info in) {
        this.in = in;
        go = new Thread(this);
        go.start();
    }

    public void run() {
        Thread t = Thread.currentThread();
        while (go == t) System.out.println(" Read " + in.getInfo());
    }

    public void stop() {
        go = null;
    }
}

class Threads5 {
    public static void main(String[] args) {
        Info i = new Info();
        MyWriter w = new MyWriter(i);
        MyReader r = new MyReader(i);

        try {
            Thread.sleep(40);
        } catch (InterruptedException e) {

        }
        w.stop();
        r.stop();
    }
}