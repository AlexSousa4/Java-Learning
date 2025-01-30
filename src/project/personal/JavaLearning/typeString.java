package project.personal.JavaLearning;

public class typeString {
    public static void main(String[] args) {
        System.out.println(' ');

        String s = "Good Afternoon";
        //you can replace the value of S, but not modify
        s = s.toUpperCase();
        s = "Good Morning"; //replacing the value
        System.out.println(s.concat("!!!"));
        System.out.println(s + "!!!!");
        System.out.println(s.startsWith("Good"));
        System.out.println(s.toLowerCase().startsWith("Good"));
        System.out.println(s.endsWith("Morning"));
        System.out.println(s.length());
        System.out.println(s.equals("Good Morning"));
        System.out.println(s.equalsIgnoreCase("Good Morning"));

        var name = "Alex";
        var surname = "Sousa";
        var age = 23;
        var salary = 123234.97;

        String oneMorePhrase = "Name: " + name + "\nSurname: " + surname +
                "\nAge: " + age +
                "\nSalary: " + salary + "\n\n";
        System.out.println(oneMorePhrase);

        System.out.printf("Mr. %s %s is %d years old and earns R$ %.2f.",
                name, surname, age, salary);
        //OR (which is particularly easier inside a string
        String phrase = String.format("\n\nMr. %s %s is %d years old and earns R$ %.2f.",
                name, surname, age, salary);
        System.out.println(phrase);


    }
}
