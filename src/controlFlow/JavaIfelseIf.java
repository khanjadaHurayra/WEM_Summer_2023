package controlFlow;

public class JavaIfelseIf {

    public static void gradesEarned(int gradeNumber) {

        if(gradeNumber>=80 && gradeNumber<=100){
            System.out.println("Grade received is  A");
        }
        else if(gradeNumber>=70 && gradeNumber<=79){
            System.out.println("Grade received is  B");
        }

        else if(gradeNumber>=60 && gradeNumber<=69){
            System.out.println("Grade received is  C");
        }
        else if(gradeNumber>100){
            System.out.println("Invalid Number");
        }
        else{

            System.out.println("Student Fail");
        }



    }

    public static void main(String[] args) {
        gradesEarned(65);
        gradesEarned(40);
        gradesEarned(0);
        gradesEarned(-100);

        whatsTheAge(-100);
    }

    public static int whatsTheAge(int age){

        if(age>=0 && age<=3){
            System.out.println("This is very small human being");

        }
        else if(age>=4 && age<=12){
            System.out.println("This is Enthuestic child");

        }
        else if(age>=13 && age<=17){
            System.out.println("This is grumpy tenager");

        }
        else if(age>=18 ){
            System.out.println("This is adult");

        }
        else{

            System.out.println("Not a Human age it is");
        }

        return age;
    }
}
