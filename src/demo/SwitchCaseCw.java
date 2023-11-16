package demo;

public class SwitchCaseCw {

    public static void test(String dayName){

        switch(dayName){

            case "Sunday","sunday":
                System.out.println("Today is sunday, campus is open");
                break;
            case "Monday","monday":
                System.out.println("Today is Monday, campus is Close");
                break;
            case "Tuesday","tuesday":
                System.out.println("Today is Tuesday, campus is Close");
                break;
            case "Wednesday","wednesday":
                System.out.println("Today is Wednesday, campus is Close");
                break;
            case "Thursday","thursday":
                System.out.println("Today is Thursday, campus is Close");
                break;
            case "Friday","friday":
                System.out.println("Today is Friday , campus is Close");
                break;
            case "Saturday","saturday":
                System.out.println("Today is Saturday, campus is Open");
                break;

            default:
                System.out.println("This is not a Day name , which u entered");
        }
    }

    public static void main(String[] args) {
        test("monday");
    }
}
