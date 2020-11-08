package lesson_85;

//Урок №85 Классы-оболочки. Character
public class MyChar {
    public static void main(String[] args) {

        char ch = '8';
        Character c = new Character(ch);

        System.out.println("Value = " + c.charValue());

        int i = Character.digit('A', 16);

        System.out.println("Number of A = " + i); //10

        boolean b = Character.isDefined('8');
        System.out.println("Is Unicode = " + b); //определен ли символ в юникоде?

        b = Character.isLowerCase('A'); //символ в нижнем регистре?
        System.out.println("Is Lower Case = " + b);

        b = Character.isJavaIdentifierPart('+'); //проверка идентификатора
        System.out.println("Is Java Identifier Start = " + b);
    }
}
