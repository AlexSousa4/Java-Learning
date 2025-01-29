package project.personal.JavaLearning;

public class temperatureExercise {
    public static void main(String[] args) {
        // (°F - 32) x 5/9 = C°)

        final double factor = 5 / 9.0;
        final double adjustment = 32;

        double fahrenheit = 86;
        double celsius = (fahrenheit - adjustment) * factor;
        System.out.println( fahrenheit + " fahrenheit in degrees is equal to = " + celsius + "C°");

        fahrenheit = 24;
        celsius = (fahrenheit - adjustment) * factor;
        System.out.println( fahrenheit + " fahrenheit in degrees is equal to = " + celsius + "C°");

    }
}
