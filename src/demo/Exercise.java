package demo;

public class Exercise {

    int x=90;
    static int y = 100;

    public static void main(String[] args) {
        int p =13;
        int q=50;

        //add int y and q
        //devide int x with y
        //multiply int x , y and p

        int sum = y+q;
        System.out.println(sum);

        Exercise ex = new Exercise();
        int devide = ex.x/q;
        System.out.println(devide);

        int multiply = ex.x*y*q;
        System.out.println(multiply);
    }
}
