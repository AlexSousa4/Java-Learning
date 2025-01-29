package project.personal.JavaLearning;

public class repeatingStructuresWhile {
    public static void main(String[] args) {
        // While, do while, for
        int count = 0;
        while (count < 10) {
            System.out.println(++count);//if you want to go up to 10, you put "(++count);"
            //count += 1; or count = count + 1 or count ++
        }
        count = 0;
        do {
            System.out.println("Inside of Do-While " + ++count);
            //or count++;
        } while (count < 10);

        for (int i = 0; i < 10; i++) {
            System.out.println("For " + i);
        }
        //or you can do
        // for(count= 0; count < 10; count++){
        // System.out.println("For " + count);}
    }
}
