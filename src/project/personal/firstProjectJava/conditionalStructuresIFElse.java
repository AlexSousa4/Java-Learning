package project.personal.firstProjectJava;

public class conditionalStructuresIFElse {
    public static void main(String[] args) {
        /** IF, ELSE AND ELSE IF*/

        double money = 2000F;
        double itemValue = 5000F;
        int age = 20;

        checkIfCanBuyItem(money, itemValue);
        checkIfAuthorizedToBuyBeer(age);
    }
    private static void checkIfCanBuyItem(double money, double itemValue){
        if (money >= itemValue) {
            System.out.println("you have the money to buy the item");
        }
        else {
            System.out.println("you don't have the money to buy the item");
        }
    }
    private static void checkIfAuthorizedToBuyBeer(int age){
        if (age >= 21) {
            System.out.println("You are authorized to buy beer.");
        }
        else {
            System.out.println("You aren't authorized to buy beer.");
        }
    }

}
