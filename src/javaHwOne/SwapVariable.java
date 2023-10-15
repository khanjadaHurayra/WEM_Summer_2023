package javaHwOne;

public class SwapVariable {

    //Write a program to swap the values of two integers without using a temporary variable.

    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        x = x + y;   //30
        y = x - y;  //10
        x = x - y;  //20

        System.out.println("After swap the X value is - " + x + "  " + "After swap the Y value is - " + y);
    }
}
