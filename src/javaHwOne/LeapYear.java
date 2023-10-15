package javaHwOne;

public class LeapYear {
//Check if a year is a leap year using an "if-else" statement.
    public static void test(int year) {

        if((year%400==0) || (year%4==0) && (year%100!=0)){

            System.out.println(year+" Is  Leap year");
        }
        else{
            System.out.println(year+" Is not Leap year");
        }
    }

    public static void main(String[] args) {
        test(2024);
    }
}
