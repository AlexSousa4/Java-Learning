package project.personal.JavaLearning.PrimitiveTypes;

public class PrimitiveTypesInference {
    public static void main(String[] args) {
        double a = 4.5; // declaration and initialization
        System.out.println(a);

        var b = 4.5;
        System.out.println(b);

        var c = "receive a text";
        System.out.println(c);

        c = "receive another text";
        System.out.println(c);
        //Java must maintain 1 type of variable at a time

        double d; // variable has been declared
        d = 124.45; // variable has been initialized
        System.out.println(d); // used!

        //examples:
        // var e; (cannot be declared on one line and initialized on the other.
        //e = 212.3; Because VAR has to be declared and initialized on the same line.)

        var e = 23;
        System.out.println(e);

        var f = 12; // Integer
        //f = 12.01 It will not be possible because an integer value cannot store decimal places
        System.out.println(f);

        var g = 12.3; //A decimal value can store whole numbers
        g = 123;
        System.out.println(g);
    }
}
