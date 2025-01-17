package project.personal.firstProjectJava;

public class conditionalStructuresSwitchCaseExercise {
    public static void main(String[] args) {
        // Using switch given the values from 1 to 7, print whether it is a business day or a weekend
        // Considering 1 as Sunday
        byte day = 1;
        switch (day) {
            case 1:
                System.out.println("Sunday");
                System.out.println("Weekend");
                break;
            case 2:
                System.out.println("Monday");
                System.out.println("Business Day");
                break;
            case 3:
                System.out.println("Tuesday");
                System.out.println("Business Day");
                break;
            case 4:
                System.out.println("Wednesday");
                System.out.println("Business Day");
                break;
            case 5:
                System.out.println("Thursday");
                System.out.println("Business Day");
                break;
            case 6:
                System.out.println("Friday");
                System.out.println("Business Day");
                break;
            case 7:
                System.out.println("Saturday");
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Not Found");
        }
        //another resolution
        byte dayWeek = 2;
        switch (dayWeek) {
            case 1:
            case 7:
                System.out.println("weekend");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Business Day");
                break;
            default:
                System.out.println("Not Valid");
        }
    }
}
