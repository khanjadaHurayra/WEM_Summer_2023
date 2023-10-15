package javaHwOne;
public class PrivateVariable {

    //Create a class with a private variable and a public method to access it.
    static private int a = 5;
    public void test() {

        System.out.println("Here we execute Private variable " + a);
    }
    public static void main(String[] args) {
       // System.out.println("Here we execute Private variable  :" + a);
        PrivateVariable obj = new PrivateVariable();
        obj.test();
    }
}
