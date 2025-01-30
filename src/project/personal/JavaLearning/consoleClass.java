package project.personal.JavaLearning;

import java.util.Scanner;

public class consoleClass {
    public static void main(String[] args) {
        System.out.print("Good");
        System.out.print(" Morning!");

        System.out.println("Good");
        System.out.println(" Afternoon!");

        System.out.printf("Lotery : %d %d %d %d %d %n", 1, 2, 3, 4, 5, 6);
        System.out.printf("Salary: %.1f%n", 1234.5678);
        System.out.printf("Name: %s%n", "John");
        // 3 main ways to put data into the console

        Scanner entry = new Scanner(System.in);

        System.out.print("Text your name:");
        String Nome = entry.nextLine();

        System.out.print("Digite seu Sobrenome:");
        String Sobrenome = entry.nextLine();

        System.out.print("Digite sua idade:");
        int idade = entry.nextInt();

        System.out.printf("%s %s tem %d anos.%n", Nome, Sobrenome, idade);

        entry.close();
    }
}
