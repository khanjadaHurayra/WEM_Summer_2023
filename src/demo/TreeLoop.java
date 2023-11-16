package demo;

public class TreeLoop {

    public static void main(String[] args) {

        for(int i=0;i<3;i++){
           for(int j=0;j<3;j++){
               for(int k=0;k<3;k++){

                   System.out.print(i+j+k);

               }
               System.out.println(" ");
           }
        }
    }
}
