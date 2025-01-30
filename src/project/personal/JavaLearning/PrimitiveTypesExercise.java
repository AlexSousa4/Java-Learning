package project.personal.JavaLearning;

/**
 * Create variables for the fields described below <> and print the message:
 * Me 'nome', living in the street 'address', confirm that I received the salary worth 'salary' on the day 'date'
 **/

public class PrimitiveTypesExercise {
    public static void main(String[] args) {
        String name = "Alex";
        String address = "Rua XYZ";
        double salaryReceiptDate = 4000.0;
        String date = "12/12/2024";
        String report = "Me " + name + " living in the street " + address + ", confirm that I received the salary worth "
                + salaryReceiptDate + " on the day " + date + ".";

        System.out.println(report);
    }
}