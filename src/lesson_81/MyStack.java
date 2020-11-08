package lesson_81;

import java.util.Stack;

//Урок №81. Классы - коллекции. Stack
public class MyStack {
    public static void main(String[] args) {

        Stack s = new Stack();

        for (int i = 0; i < args.length; i++) {
            s.push(args[i]);
        }
        while (!s.isEmpty()) {
            System.out.println("Element " + s.peek()); //search - поиск
        }
    }
}
