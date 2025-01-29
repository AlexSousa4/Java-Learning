package project.personal.JavaLearning;


import javax.swing.*;
import java.util.Scanner;

public class challengeConversion {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        String salary = JOptionPane.showInputDialog("Enter the first salary:")
                .replace(",", ".");
        String salary2 = JOptionPane.showInputDialog("Enter the second salary:")
                .replace(",", ".");
        String salary3 = JOptionPane.showInputDialog("Enter the third salary:")
                .replace(",", ".");
        double valor1 = Double.parseDouble(salary);
        double valor2 = Double.parseDouble(salary2);
        double valor3 = Double.parseDouble(salary3);

        double result = (valor1 + valor2 + valor3) / 3;
        System.out.println("Average salary is: " + result);

        entry.close();
    }
}
