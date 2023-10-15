package javaHwOne;
public class DandPconstructor {

    //Create a class with a default constructor and a parameterized constructor.
    String name;
    public DandPconstructor(String n) {
        this.name = n;

        System.out.println("My Name is - " + n);
    }
    public DandPconstructor() {

        System.out.println("I am default constructor");
    }

    public static void main(String[] args) {
        DandPconstructor obj = new DandPconstructor("Khanjada Abu Hurayra");
        DandPconstructor obj2 = new DandPconstructor();
    }
}
