package javaHwOne;

public class InstanceAndLOcal {

    // Explain the difference between instance variables and local variables.

    int a = 5; // this is instance or class level variable, its always b in the class level carly braces.

    public static void test() {

        int a = 5;// this is local variable, its always b inside the method level carly  braces.
        // Here this variable is local ,
        //thats  why this variable not showed duplicate.
    }
}
