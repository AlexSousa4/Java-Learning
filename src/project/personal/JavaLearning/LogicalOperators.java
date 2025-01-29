package project.personal.JavaLearning;

public class LogicalOperators {
    public static void main(String[] args) {
        /** The Logical Operators are:
         * && (AND) || (OR) !
         * **/

        //Example

        int age = 30;
        float salary = 3500F;
        boolean withinTheLawGreater30 = age > 30 && salary >= 4612;
        boolean withinTheLawLess30 = age < 30 && salary >= 3381;

        System.out.println("withinTheLawGreater30 " + withinTheLawGreater30);
        System.out.println("withinTheLawLess30 " + withinTheLawLess30);


        //personal example

        int agePeople = 20;
        int drinkingAge = 21;
        boolean permissionDrink = agePeople >= 21 && drinkingAge >= 21;
        System.out.println("Can this person drink? " + permissionDrink);


        //OR

        double totalCurrentAccountValue = 200;
        double totalValueSavingsAccount = 10000;
        float seriesXValue = 4000F;
        boolean isXboxSeriesXPurchasable = totalCurrentAccountValue > seriesXValue || totalValueSavingsAccount > seriesXValue;
        System.out.println("Is Xbox Series X Purchasable? " + isXboxSeriesXPurchasable);
    }
}
