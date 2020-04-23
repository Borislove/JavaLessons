package lesson_69;

public class Doctor {

    void cure() {

    }
}

class Dentist extends Doctor {

    void cure() {
        System.out.println("Treat teeth");
    }
}

class Surgeon extends Doctor {

    void cure() {
        System.out.println("Perform operation");
    }
}

class MyMain {

    public static void main(String[] args) {

        Dentist d = new Dentist();
        Surgeon s = new Surgeon();

        Doctor doc;

        doc = d;
        doc.cure();
    }
}