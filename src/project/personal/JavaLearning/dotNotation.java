package project.personal.JavaLearning;

public class dotNotation {
    public static void main(String[] args) {
        String s = "Good Morning X";
        s = s.replace("X","lady");
        s = s.toUpperCase();
        System.out.println(s);

        String x = "Leo".toUpperCase();
        System.out.println(x);

        String y = "Good Afternoon X"
                .replace("X", "Alex")
                        .toUpperCase()
                                .concat("!!!");
        System.out.println(y);

        //PRIMITIVE TYPES DO NOT HAVE THE OPERATOR "."

    }
}
