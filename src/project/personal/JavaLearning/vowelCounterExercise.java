package project.personal.JavaLearning;

import java.util.Scanner;

public class vowelCounterExercise {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Write a sentence: ");
        String sentence = read.nextLine();
        String lowerCase = sentence.toLowerCase();

        int vowelCount = 0;
        for (int i = 0; i < lowerCase.length(); i++) {
            char ch = lowerCase.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }
        System.out.println("There is " + vowelCount + " vowels in the sentence");
        read.close();
    }
}
