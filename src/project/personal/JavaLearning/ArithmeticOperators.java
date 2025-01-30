package project.personal.JavaLearning;

public class ArithmeticOperators {
    public static void main(String[] args) {
        /**
         * basic operators + - / *
         */

        int number01 = 50;
        int number02 = 40;
        String example = "if you insert a string before the operators, java will consider a concatenation, not a math operation ";
        System.out.println(example + number01 + number02);

        int number03 = 10;
        int number04 = 20;
        String example02 = " but if you insert a string after the operators, java will consider a mathematical operation";
        System.out.println("the result is the number " + (number03 - number04 + example02));

        int number05 = 60;
        double number06 = 30;
        double result = number05 / number06;
        System.out.println(result);

        int number07 = 90;
        int number08 = 80;
        int result01 = number07 * number08;
        System.out.println(result01);
    }
}
