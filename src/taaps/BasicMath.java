package taaps;

//№29. Арифметические операции

public class BasicMath {

    public static void main(String[] args) {

        int a = 2 + 3;     //5
        int b = a + 5;   //10
        int c = b * a;   //50
        int d = c - b;   //40
        int e = a / 2;    //2  (not 2.5)
        int g = a % 2;   //1
/*
        a = a + 4;
        a += 4;*/

        //  a--; //декремент
        // a++; //инкремент

        int post = a++;
        int pre = ++a;

        System.out.println(" a = " + a);
        System.out.println(" b = " + b);
        System.out.println(" c = " + c);
        System.out.println(" d = " + d);
        System.out.println(" e = " + e);
        System.out.println(" g = " + g);

        System.out.println("post " + post);
        System.out.println("pre " + pre);

        float f1 = 0.05f;
        float f2 = 1.05f;
        System.out.println(f1 + f2);

        double d1 = 0.05;
        double d2 = 1.05;
        System.out.println(d1 + d2);
    }
}
