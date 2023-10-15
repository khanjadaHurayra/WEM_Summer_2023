package javaHwOne;
public class equalAndEqualignorecase {

    //Explain the difference between "==" and ".equalsignoreCase()" for comparing strings.
    public static void main(String[] args) {

        String name1 = "Khanjada abu Hurayra";
        String name2 = "Khanjada abu hurayra";

        if (name1 == name2) {

            System.out.println("This is ==  example   ");

        } else if (name1.equalsIgnoreCase("khanjada Abu Hurayra")) {

            System.out.println("This is Equal ignore case example");


        } else {

            System.out.println("This not exact thing");
        }
    }
}
