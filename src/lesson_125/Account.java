package lesson_125;

//Урок №125. Java. Синхронизация подпроцессов
/*
 * t1 & t2
 * balance = 100$;
 *
 * t1 -> 80$  t2 ->60$
 * t1 -> amount --> balance true 100>80
 * t2
 * t2 -> amount > balance --> true 100> 60
 * t2 -> balance -=amount; --> return true;
 * t1
 * t1 -> balance -=amount; --> return true;
 *
 * balance = -40$
 * */

public class Account {

    int balance;

    public boolean withdraw(int amount) {

        synchronized (this) {
            if (amount > balance) return false;
            balance -= amount;
            return true;
        }
    }
}
