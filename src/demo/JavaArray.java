package demo;

public class JavaArray {

    public static void main(String[] args) {
        //one dimon array
        int [] a ={12,87,54};
        String [] str={"ABC","DEF","GHI"};
        char [] ch1={'A','R','B'};
        double [] d ={10.4,4.0,9.1};

        int str1=str.length;


         System.out.println(d.length);
         System.out.println(d[2]);

         for(int x=0; x<str.length; x++){

             System.out.print(str[x]+"\t"+": ");
         }

    }
}
