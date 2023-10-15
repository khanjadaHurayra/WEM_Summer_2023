package javaHwOne;

public class StaticClass {

    //Define a static method that can be called without creating an object of the class.

    public static void test(){

        System.out.println("I am static Method, thats why i executed");
    }

    public static void main(String[] args) {
        test();//  we can call direct by method name , when both method are static method.
    }
}
