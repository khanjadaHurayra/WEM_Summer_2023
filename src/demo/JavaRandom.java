package demo;

import java.util.Random;

public class JavaRandom {

    public static void main(String[] args) {

        Random random = new Random();

        int randomInt= random.nextInt();
        int randomInt2= random.nextInt(5);
        double randomDouble= random.nextDouble();

        System.out.println(randomInt);
        System.out.println(randomInt2);
        System.out.println(randomDouble);


    }
}
