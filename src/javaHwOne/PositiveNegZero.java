package javaHwOne;

public class PositiveNegZero {
    // Check if a number is positive, negative, or zero using "if-else if" statements.

    public static void test(int number) {

        if (number < 0) {
            System.out.println("Input number is - Negative ");
        } else if (number > 0) {
            System.out.println("input number is Positive  ");
        } else {

            System.out.println("Input Number is - Zero  ");
        }
    }

    public static void main(String[] args) {

        test(1000);
    }
}
