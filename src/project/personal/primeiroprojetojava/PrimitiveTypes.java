package project.personal.primeiroprojetojava;

public class PrimitiveTypes {
    //utilizar o atalho porem depende "psvm"
    public static void main(String[] args){
    // int, double, float, char, byte, short, long, boolean
        int age = 10; // -2,147,483,648 to 2,147,483,647 / default value: 0
        long bigNumber = 10000; // -9,223,372,036,854,775,808 to 9,223,372,036,854,750,000 / default value: 0
        double salaryDouble = 4000.0d; //1.7e-308 to 1.7e+038 / default value: 0.0d
        /**
         * utilizar numeros decimais sempre em double (ex: 4000.0d)
         */
        float salaryFloat = 2500.0f; // 3.4e-038 to 3.4e+038 / default value: 0.0f
        byte ageByte = 10; // -128 to 127 / default value: 0
        short ageShort = 15; // -32768 to 32767
        boolean trues = true; //true or false / default value: false
        boolean falses = false;
        char character = '\u0041'; // default value \u0000
        String specification  = "There is no limit to insert values in the string";



        System.out.println("A idade é "+age+" anos");
        System.out.println(bigNumber - salaryDouble);
        System.out.println("the data type int is used to store integers, without decimals with a value that varies" +
                " -2,147,483,648 to 2,147,483,647. for example: " + age);
        System.out.println("the data type long is used to store bigger integers than int. for example: " + bigNumber);
        System.out.println("the data type double is used to store dot(.) floating numbers with double precision. for example: " + salaryDouble);
        System.out.println("the data type float is used to store numbers in floating point of simple precision. its useful for represent" +
                "numeric values with decimal places in cases when the double complete precision is not necessary. for example: " + salaryFloat);
        System.out.println("the data type byte is used to store a small integer numbers. for example: " + ageByte);
        System.out.println("the data type short is a primitive type used to store integers numbers in a range bigger than byte. for example: " + ageShort);
        System.out.println("the data type boolean is a primitive type used to store logical values, in other words, true or false. for example: " + trues +" and " + falses);
        System.out.println("the data type char is a simple and powerful type, mainly used to represent logical states and control " +
                "the execution flow of the program. for example: "+ character);
        System.out.println(specification);
    }
}


