package lesson_74;

//Урок №74. Несколько операторов catch
public class MyCatch {
    public static void main(String[] args) {

        try {
            int l = args.length;
            System.out.println("Length = " + l);

            int h = 10 / l;
            args[l + 1] = "10";

        } catch (ArithmeticException e) {
            System.out.println("// by zero");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("index of array");
        }
    }
}
