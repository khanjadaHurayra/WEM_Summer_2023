package javaHwTwo;

public class TriangleForLoop {

    public static void test(int num){

       /* 6. **Nested For Loop (Pattern)**: Write a Java program to print
        a right-angled triangle pattern using nested for loops.*/

        for(int i=1;i<=num;i++){

            for(int j =1;j<=i;j++){

                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        test(10);
    }
}
