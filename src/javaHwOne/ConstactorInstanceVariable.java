package javaHwOne;

public class ConstactorInstanceVariable {

    int a;   //Here a, and b are instance Variable.
    int b;

    public ConstactorInstanceVariable(int a, int b) {

        this.a = a;
        this.b = b;

        System.out.println(a + b);

    }

    public static void main(String[] args) {

        ConstactorInstanceVariable obj = new ConstactorInstanceVariable(5, 6);
    }
}
