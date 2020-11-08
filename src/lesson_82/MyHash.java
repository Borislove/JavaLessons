package lesson_82;

import java.util.Hashtable;

//Классы - коллекции. Hashtable
public class MyHash {
    public static void main(String[] args) {

        Hashtable phoneBook = new Hashtable();

        phoneBook.put("Tom", "4356789");
        phoneBook.put("John", "5366789");
        phoneBook.put("Bill", "5555789");
        phoneBook.put("Ralf", "1244789");
        phoneBook.put("Jane", "2116789");

       // System.out.println("Number is "+phoneBook.get("Bill"));
        System.out.println(phoneBook.contains("33333"));  //поиск значение - false
        System.out.println(phoneBook.contains("2116789"));

        System.out.println(phoneBook.containsKey("Ralf")); //поиск по ключу - true

        System.out.println(phoneBook.isEmpty()); //пуста ли наша таблица?


        phoneBook.remove("Tom"); //удаляем из таблицы
        System.out.println(phoneBook.containsKey("Tom"));
        System.out.println(phoneBook.contains("4356789"));
    }
}
