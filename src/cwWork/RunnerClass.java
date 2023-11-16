package cwWork;

public class RunnerClass {

    public static void main(String[] args) {

        ClassA a = new ClassA();
        ClassB b = new ClassB();
        ClassC c = new ClassC();


        a.test1();
        a.test2();

        System.out.println("********  ********** **********");

        b.test1();
        b.test2();

        System.out.println("********  ********** **********");

        c.test1();
        c.test2();

    }
}
