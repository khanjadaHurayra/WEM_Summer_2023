package javaHwTwo;
//1. **If-Else**: Write a Java program to check if a number is even or odd using an if-else statement.
public class OddEven {

    public static void test(int i){



        if ( i % 2 == 0){


            System.out.println("This is Even Nymber - "+i);
        }
        else {
            System.out.println("This is Odd Number  "+i);
        }
    }

    public static void main(String[] args) {
        test(10);
    }
}
