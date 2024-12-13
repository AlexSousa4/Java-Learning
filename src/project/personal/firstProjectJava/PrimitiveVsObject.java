package project.personal.firstProjectJava;

public class PrimitiveVsObject {
    public static void main(String[] args) {

        String s = new String("text");
        s.toUpperCase();

        //Wrappers are the object version of types primitives.
        int a = 123;
        System.out.println(a);
    }
}
