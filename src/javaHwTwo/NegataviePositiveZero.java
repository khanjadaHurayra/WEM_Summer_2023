package javaHwTwo;

//2. **If-Else If**: Create a Java program that determines if a number is positive, negative, or zero using if-else if statements.

public class NegataviePositiveZero {

    public static void test(int number){

        if(number>0){
            System.out.println("This is Positive number  ->" + number);
        }

        else if(number<0){
            System.out.println("This is negative number  ->" + number);
        }
        else{
            System.out.println("This is Zero  ->"+number);
        }
    }

    public static void main(String[] args) {
        test(10);
    }

}
