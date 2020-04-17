//Урок №38. Управляющий оператор switch
public class MySwitch {
    public static void main(String[] args) {
        int i = 1;
        switch (i) {
            case 0:
                System.out.println("i = 0");
                break;
            case 1:
                System.out.println("i = 1");
                break;
            default:
                System.out.println(" i > 1");
        }
        System.out.println("Finish");
    }
}
