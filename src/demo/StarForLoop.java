package demo;

public class StarForLoop {

    public static void test(int n) {


            for(int i=1;i<=n;i++){
                for(int j=1;j<=n;j++){

                    if(i==1 || i==n || j==1 || j==n  ){
                        System.out.print("* ");
                    }
                    else{
                        System.out.println(" ");
                    }
                }
                System.out.println();
            }

    }

    public static void test2(){

        char[] ch={'a','b','c'};

        for(int i=0;i<ch.length;i++){
            System.out.println(ch[i]);
        }
  int [] a ={56,97,747,76,46,43,4,32,12};

        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
for(int n:a){

    System.out.println(n);
}
    }

    public static void test3(){

        String[][] name =new String[2][2];

        name[0][0]="Khanjada";
        name[0][1]="Monsur";

        name[1][0]="Turgut";
        name[1][1]="Rifa";


        for(int i=0;i<name.length;i++){
            for(int j=0;j<name[i].length;j++){
                System.out.println(name[i][j]);
            }
        }

        System.out.println("**********   *************** ***************");

        for(String[]name1:name){
            for(String name2:name1){
                System.out.println(name2);
            }
        }
    }

    public static void main(String[] args) {
        test(5);
        test2();
        test3();
    }
}
