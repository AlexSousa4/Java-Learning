package project.personal.JavaLearning;
import java.util.Scanner;


public class multidimensionalArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] daysAndMonths = new String[12][11];
        daysAndMonths[0][0] = "January";
        daysAndMonths[1][0] = "February";
        daysAndMonths[2][0] = "March";
        daysAndMonths[3][0] = "April";
        daysAndMonths[4][0] = "May";
        daysAndMonths[5][0] = "June";
        daysAndMonths[6][0] = "July";
        daysAndMonths[7][0] = "August";
        daysAndMonths[8][0] = "September";
        daysAndMonths[9][0] = "October";
        daysAndMonths[10][0] = "November";
        daysAndMonths[11][0] = "December";


        daysAndMonths [0][1] = "1";
        daysAndMonths [0][1] = "2";
        daysAndMonths [0][1] = "3";
        daysAndMonths [0][1] = "4";
        daysAndMonths [0][1] = "5";
        daysAndMonths [0][1] = "6";
        daysAndMonths [0][1] = "7";
        daysAndMonths [0][1] = "8";
        daysAndMonths [0][1] = "9";
        daysAndMonths [0][1] = "10";
        daysAndMonths [0][1] = "11";
        daysAndMonths [0][1] = "12";

        System.out.println("write a number from 1 to 12 and the corresponding month will appear: ");
        String numberMonth = scanner.nextLine();

        int monthIndex = Integer.parseInt(numberMonth) - 1;

        if (monthIndex >= 0 && monthIndex < 12){
            System.out.println("The Month is: " + daysAndMonths[monthIndex][0]);
        }else{
            System.out.println("Invalid Number, please enter a  number between 1 and 12");

        scanner.close();
        }
    }
}