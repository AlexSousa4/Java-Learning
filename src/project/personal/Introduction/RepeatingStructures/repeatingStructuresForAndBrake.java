package project.personal.Introduction.RepeatingStructures;

public class repeatingStructuresForAndBrake {
    public static void main(String[] args) {
        /*
        Print all pair numbers from 0 to 100000
         for (int i = 0; i < 100000; i++) {
           if (i % 2 == 0){
              System.out.println(i);
            }
           } EXAMPLE ABOUT FOR
        EXERCISE ABOUT FOR INCLUDING THE BRAKE
        */

        int number = 10;
        System.out.println("Prime Numbers between 1 and " + number + ":");

        for (int i = 2; i < number; i++) {
            boolean prime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) System.out.println(i);
        }
    }
}
