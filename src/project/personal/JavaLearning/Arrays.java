package project.personal.JavaLearning;

public class Arrays {
    public static void main(String[] args) {
        //Byte, short, int, long float and double the default value is 0
        //char '\u0000' ' '
        //boolean false
        //string null
        int[] ages = new int[5];
        ages[0] = 23;
        ages[1] = 34;
        ages[2] = 76;
        ages[3] = 87;
        ages[4] = 98;
        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);
        System.out.println(ages[3]);
        System.out.println(ages[4]);

        String[] names = new String[4];
        names[0] = "Alex";
        names[1] = "Isadora";
        names[2] = "John";
        names[3] = "Jojo";

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
