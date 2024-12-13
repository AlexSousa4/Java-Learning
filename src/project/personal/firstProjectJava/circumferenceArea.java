package project.personal.firstProjectJava;

public class circumferenceArea {
    public static void main(String[] args) {
        // double radius2 = 3.4; (double used to be able to enter decimal numbers )
        // int radius = 3;  (Int used to enter integers)
        double radius = 3.4;
        // final is so that the value of the constant never changes
        final double PI = 3.14159;

        double area = PI * radius * radius;
        System.out.println(area);

        radius = 10;
        area = PI * radius * radius;
        System.out.println( "Área = " + area + "m2.");
    }

}