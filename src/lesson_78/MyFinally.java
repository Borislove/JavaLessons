package lesson_78;

//Блок finally
public class MyFinally {

    static void firstMethod() {

        try {
            System.out.println("In First method");
            throw new RuntimeException("Info");
        } finally {
            System.out.println("finally for First method");
        }
    }

    static void secondMethod() {

        try{
            System.out.println("In Second method");
            return;
        }finally {
            System.out.println("finally for Second method");
        }
    }

    static void thirdMethod(){

        try{
            System.out.println("In Third method");
        }finally {
            System.out.println("finally for Third method");
        }
    }

    public static void main(String[] args) {

        try {
            firstMethod();
        }catch (Exception e){
            System.out.println("Exception");
        }

        secondMethod();
        thirdMethod();
    }
}

