import java.util.Scanner;
public class DaysInAWeek{
    enum Days{
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY
    }
    public static void main(String [] args){
        int num = new Scanner(System.in).nextInt();
        num %= 7;
        System.out.println(Days.values()[num]);
    }
}