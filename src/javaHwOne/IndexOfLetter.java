package javaHwOne;

public class IndexOfLetter {

    //Find the index of letter S from following String “The Sky is Beautiful ”.
    //Write a Java code to reverse the String  from question 24

    public static void main(String[] args) {

        String st = "The Sky is Beautiful";

        System.out.println(st.indexOf('S'));
        //System.out.println(st.indexOf('B'));

        StringBuilder sb = new StringBuilder(st);// reverse the " The Sky is Beautiful.
        System.out.println(sb.reverse());

    }
}
