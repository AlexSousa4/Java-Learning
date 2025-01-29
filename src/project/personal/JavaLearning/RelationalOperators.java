package project.personal.JavaLearning;

public class RelationalOperators {
    public static void main(String[] args) {
        // %
        int rest = 23 % 7;
        System.out.println(rest);
        // < > will always be boolean
        boolean isTenGreaterTwenty = 10 > 20;
        boolean isTenLessTwenty = 10 < 20;
        // == comparing will always be boolean
        boolean isTenEqualsTwenty = 10 == 20;
        boolean isTenEqualsTen = 10 == 10;
        // <= >= will always be boolean
        boolean isTenEqualOrGreaterTwenty = 10 >= 20;
        boolean isTenEqualOrLessTwenty = 10 <= 20;
        // != will always be boolean
        boolean isTenDifferentTen = 10 != 10;
        System.out.println("Is ten greater than twenty? " + isTenGreaterTwenty);
        System.out.println("Is ten less than twenty? " + isTenLessTwenty);
        System.out.println("Is ten equal to twenty? " + isTenEqualsTwenty);
        System.out.println("Is ten equal to ten? " + isTenEqualsTen);
        System.out.println("Is ten equal to or Greater than twenty? " + isTenEqualOrGreaterTwenty);
        System.out.println("Is ten equal to or less than twenty? " + isTenEqualOrLessTwenty);
        System.out.println("Is ten different from ten? " + isTenDifferentTen);
    }
}
