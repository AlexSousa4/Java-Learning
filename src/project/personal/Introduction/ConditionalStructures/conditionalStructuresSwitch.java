package project.personal.Introduction.ConditionalStructures;

public class conditionalStructuresSwitch {
    public static void main(String[] args) {
        //Print the day of the week, considering 1 as sunday
        byte day = 15;
        // just accept char, int, byte, short, enum, string
        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Not Found");
                break;
        }

        String sex = "F";
        switch (sex) {
            case "M":
                System.out.println("Man");
                break;
            case "F":
                System.out.println("Woman");
                break;
            case "LGBT":
                System.out.println("Other Gender");
                break;
            default:
                System.out.println("Invalid Option");
        }
    }
}
