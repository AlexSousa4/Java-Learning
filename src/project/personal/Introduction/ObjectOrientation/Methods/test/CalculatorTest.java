package project.personal.Introduction.ObjectOrientation.Methods.test;

import project.personal.Introduction.ObjectOrientation.Methods.domain.Calculator;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.sum(55, 23);
        calculator.subtraction(89, 87);
        calculator.division(78, 87);
        calculator.multiplication(34, 55);
    }

}
