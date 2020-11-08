package lesson_90;

//Урок №91. Java. Создание и реализация интерфейсов
public interface Pet {

    void voice();
}

class Dog implements Pet {

    public void voice() {
        System.out.println("Dog's voice");
    }
}

class Cat implements Pet{

    public void voice(){
        System.out.println("Cat's voice");
    }
}

class IntTest{
    public static void main(String[] args) {
        Pet p = new Cat();
        p.voice();
    }
}