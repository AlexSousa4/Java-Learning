package project.personal.JavaLearning.PrimitiveTypes;

public class conversationTypePrimitiveNumeric {
    public static void main(String[] args) {

        double a = 1;//implicit
        System.out.println(a);

        //When an explicit conversion is made, you are aware that data may be lost
        float b = (float) 1.123456799898;//explicit (CAST)
        System.out.println(b);

        int c = 130;
        byte d = (byte) c;//explicit (CAST)
        System.out.println(d);

        double e = 1.999;
        int f = (int) e;//explicit (CAST)
        System.out.println(f);
    }
}
