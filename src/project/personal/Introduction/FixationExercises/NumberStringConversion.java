package project.personal.Introduction.FixationExercises;

import javax.swing.*;

public class NumberStringConversion {

    public static void main(String[] args) {
        String valor1 = JOptionPane.showInputDialog(
                "Enter the first number");
        String valor2 = JOptionPane.showInputDialog(
                "Enter the second number");
        System.out.println(valor1 + valor2);

        double number1 = Double.parseDouble(valor1);
        double number2 = Double.parseDouble(valor2);

        double soma = number1 + number2;
        System.out.println("Sum is " + soma);
        System.out.println("Average is " + soma / 2);
    }
}
