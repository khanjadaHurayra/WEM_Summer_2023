package controlFlow;

public class JavaIfElse {

    public static void main(String[] args) {
        int score = 70;

        if(score>=60){

            System.out.println("This student has passed the course");

        }
        else{
            System.out.println("Take your second exam , good Luck");

        }
        ageChecker();
        dayOfWeek("monday");

    }


    public static void ageChecker(){

        int age = 50;

        if(age>=18){
            System.out.println("The person is Adult");
        }
        else{
            System.out.println("The person is Minor");
        }

    }

    public static void dayOfWeek(String dayName){

        if(dayName.equalsIgnoreCase("sunday") || dayName.equalsIgnoreCase("saturday")){

            System.out.println("Today we have Class");
        }

        else{

            System.out.println("Take Nap::::");
        }




    }


}
