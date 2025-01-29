package project.personal.JavaLearning;

public class BreakExercise {
    //given the value of a car, find out how many times it can be paid in installments
    //condition installmentValue >= 1000
    public static void main(String[] args) {
    double totalValue = 30000;

        for (int installment = 1; installment <= totalValue ; installment++) {
            double installmentValue = totalValue / installment;

            //or, you do this and save code
            //if (installmentValue < 1000){
            //break;}

            if(installmentValue >= 1000){
                System.out.println("Installment " + installment+ " R$ "+installmentValue);
            }else{
                break;
            }
        }
    }
}
