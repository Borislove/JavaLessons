package lesson_44;

//Урок №44
public class MyDays {
    public static void main(String[] args) {

        int i = 11;
        String days[][] = {{"31", "28", "31", "30", "31", "30", "31", "31", "30", "31", "30", "31"},
                {
                        "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
                }};

        System.out.println("Result -> "+days[1][i] + " has " + days[0][i] + " days.");
    }
}
