package demo;

public class JavaMethods {


    public static void sumOFDoubleNumbers(){

        double x= 10;
        double y=20;

        double total =x+y;

        System.out.println("This is the sum of two Double Numbers  "+ total);
    }


    //This method is a static void method, without parameters.
    public static void sumOFTwoNumbers(){

        int a=5;
        int b=9;
        int sum= a+b;


        System.out.println("This is the sum of two Numbers  "+ sum);

    }
// this is static return type method with parameters
    public static int  sumOfTwoDigit(int a, int b){

        int sum =a+b;

        System.out.println("This is sum of two digit " +  sum);
        return sum;
    }

//This is a non static , void  type  withput parameter method
    public void sumOfTwo(){

        double a=10.1;
        double b=20.2;
        double sum = a+b;

        System.out.println("This is the sum of 2 Doubles    " + sum);
    }

    public static void numberMultiply(int a, int b){

        int multiply= a+b;
        System.out.println("This 2 Number Multiply  ="+ multiply);


    }

    public  void numberDevide() {
        int a = 10;
        int b = 20;
        int devide = a / b;
        System.out.println("This 2 devide =  " + devide);
    }
    public static void main(String [] args) {

        sumOFTwoNumbers();
        sumOFDoubleNumbers();
        sumOfTwoDigit(20,10);

        JavaMethods doubleSum = new JavaMethods();
        doubleSum.sumOfTwo();


        numberMultiply(3,4);
        doubleSum.numberDevide();
    }
}
