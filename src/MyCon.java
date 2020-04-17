//Урок №40. Операторы перехода continue, return
public class MyCon {
    public static void main(String[] args) {
        first:
        for (int i = -5; i < 5; i++) {
            //    if (i == 5) continue;
            if (i == 0) continue first;
            System.out.println("i = " + 1 / i);
        }
    }
}
