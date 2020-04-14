package taaps;

//побитовые операции
public class MyBit {

    public static void main(String[] args) {

        int a1 = 5; //101  ->   1010
        int a2 = 6; //110

        int b = a1 & a2; //  100
        System.out.println("Result is " + b);
        
        int b1 = a1 | a2; //111
        System.out.println("b1 = " + b1);
        
        int b2 = a1 ^ a2; //исключающее или    0111
        System.out.println("b2 = " + b2);
        
        int b3 = a1<<1;
        System.out.println("b3 = " + b3);
    }
}
