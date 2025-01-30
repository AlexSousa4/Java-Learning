package project.personal.JavaLearning;

public class repeatingStructuresContinue {
    public static void main(String[] args) {
        double houseValue = 100000;
        for (int installment = (int) houseValue; houseValue >= 1; installment--) {
            double installmentValue = houseValue / installment;
            if (installmentValue < 1000) {
                continue;
            }
            System.out.println("As long as the value of the installment is not less than one thousand, it does not go to the line 11 and executes SOUT");
        }
    }
}
