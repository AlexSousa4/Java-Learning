package project.personal.firstProjectJava;

public class AssignmentOperators {
    public static void main(String[] args) {
        /**
         * assignment operators are
         * "= += -= *= /= %="
         * */

        double bonus = 1800;
        bonus += 1000; //2800
        bonus -= 1200; //1600
        bonus *= 2; //3200
        bonus /=3; //1066
        bonus %= 2; // 0.6666666....
        System.out.println(bonus);


        int counter = 0;
        counter += 1; // counter = counter +1;
        counter ++;
        counter --;
        ++counter;
        --counter;
        System.out.println(counter);
    }
}
