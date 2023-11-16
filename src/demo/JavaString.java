package demo;

public class JavaString {

    public static void main(String[] args) {

            //String is imutable, but string buffer string  and String builder is immutable
        String str1="Today is Sunday";
        String str2= new String("Today is Sunday");



        String firstName="Mansur";
        String lastName="Ahmed";

        String fullName=firstName+"  "+lastName;

        System.out.println(fullName);

        String abc="Our class";
        String bcd="Our Class";
        System.out.println(abc==bcd);
        System.out.println(abc.equalsIgnoreCase(bcd));

        //Length of String.

        String randomStr="hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh";
        int string=randomStr.length();

            System.out.println(string);


            //CharAt() find character in terms of index number
            //Number of index = Number of length-1
            String charString="Khanjada";
            charString.charAt(5);
            System.out.println(charString.charAt(5));

            //UpperCase and LowerCase

        String str3="Cats are cute";

        System.out.println(str3.toUpperCase());
        System.out.println(str3.toLowerCase());

        //IndexOf
        String days="Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday";
        int findIndex= days.indexOf('M');
        System.out.println(findIndex);

        String newStr="Hallo world";


    }
}
