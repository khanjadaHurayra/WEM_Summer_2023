package demo;

public class WhileLoopSeriesAdd {
    //wrong
    public static void test(int n) {

        double sum = 0;

        int i = 1;

        while (i<=n){

            sum = sum + 1.0/i;
            System.out.println(i);
            System.out.println("The Value of i = "+i+"  An the value of Sum  = "+sum);
            i++;
        }
    }

    public static void subtract15() {
        int value = 90;
        for (int i = 0; i < 15; i++) {
            value = value - i;
            System.out.println(value);
        }
    }
        public static void main (String[]args){
            test(10);
          //  subtract15();
        }
    }
