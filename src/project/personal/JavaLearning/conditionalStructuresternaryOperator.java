package project.personal.JavaLearning;

public class conditionalStructuresternaryOperator {
    public static void main(String[] args) {
        //Donate if salary > 5000
        double salary = 6000;
        String check = checkIfICanDonate(salary);
        System.out.println(check);
    }
    private static String checkIfICanDonate (double salary) {
        String messageDonate = "I will donate 500 to the charity";
        String messageNotDonate = "I don't have conditions to donate";
        // (condition) ? true : false
        String result = salary > 5000 ? messageDonate : messageNotDonate;
        return result;
    }
}


