package project.personal.JavaLearning;

public class exerciseConditionStructures {
    public static void main(String[] args) {
        // if age is less(<) than 15, print "children's category"
        // else age is bigger or equal(>=) than 15 or (&&) less than 18, print "youth category"
        // if age is bigger or equal(>=) 18, print "adult category"

        int age = 17;
        String category = checkIfAgeIsCorrect(age);
        System.out.println("Category: " + category);
    }
    private static String checkIfAgeIsCorrect(int age){
        String category;
        if (age < 15){
            category = "Children's Category";
        }else if (age >= 15 && age < 18){
            category = "Youth Category";
        }else{
            category = "Adult Category";
        }
        return category;
    }
}
