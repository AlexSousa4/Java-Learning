package project.personal.firstProjectJava;

public class conditionalStructuresExercise {
    public static void main(String[] args) {
        //I Want to Know how much I have to pay in the Netherlands 2020 base on my annual salary
        //€0        €34,712        9.70%
        //€34,713   €68,507        37.35%
        //€68,508   49.50%
        double annualSalary = 70000;
        TaxRates taxRates = new TaxRates(9.70 / 100, 37.35 / 100, 49.5 / 100);
        String check = howMuchTaxesInNetherlands2020(annualSalary, taxRates);
        System.out.println(check);
    }

    private static String howMuchTaxesInNetherlands2020(double annualSalary, TaxRates taxRates) {
        double taxesValue;
        if (annualSalary <= 34712){
            taxesValue = annualSalary * taxRates.getFirstTrack();
        }else if (annualSalary >= 34713 && annualSalary <= 68507){
            taxesValue = annualSalary * taxRates.getSecondTrack();
        }else{
            taxesValue = annualSalary * taxRates.getThirdTrack();
        }
        return "Tax Amount: " + taxesValue;
    }

    static class TaxRates {
        private final double firstTrack;
        private final double secondTrack;
        private final double thirdTrack;

        public TaxRates(double firstTrack, double secondTrack, double thirdTrack) {
            this.firstTrack = firstTrack;
            this.secondTrack = secondTrack;
            this.thirdTrack = thirdTrack;
        }

        public double getFirstTrack() {
            return firstTrack;
        }

        public double getSecondTrack() {
            return secondTrack;
        }

        public double getThirdTrack() {
            return thirdTrack;
        }
    }
}