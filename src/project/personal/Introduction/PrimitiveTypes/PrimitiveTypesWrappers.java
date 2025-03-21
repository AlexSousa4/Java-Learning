package project.personal.Introduction.PrimitiveTypes;

public class PrimitiveTypesWrappers {
    public static void main(String[] args) {
        //byte
        //capital letter convert to class,
        //lowercase primitive type
        Byte b = 100;
        Short s = 1000;

        //Integer.parseInt(enter.next());
        Integer i = 10000; // int
        Long l = 100000L;

        System.out.println(b.byteValue());
        System.out.println(s);
        System.out.println(i * 3);
        System.out.println(l / 3);

        Float f = 1234.10F;
        System.out.println(f);

        Double d = 1234.445676;
        System.out.println(d);

        Boolean bo = Boolean.parseBoolean("true");
        System.out.println(bo);
        System.out.println(bo.toString().toUpperCase());

        Character c = '#'; // char
        System.out.println(c + "...");

    }
}
