package project.personal.JavaLearning;

public class arraysForEach {
    public static void main(String[] args) {
        //Three ways to initialize the array
        int [] numbers = new int[4];
        numbers[0] = 23;
        numbers[1] = 34;
        numbers[2] = 76;
        numbers[3] = 87;
        int [] numbers2 = {1,2,3,4,5};
        int [] numbers3 = new int [] {1,2,3,4,5};

        for (int i = 0; i < numbers2.length; i++) {
            System.out.println(numbers[i]);
            System.out.println(numbers2[i]);
            System.out.println(numbers3[i]);
        }
        for (int num:numbers3){
            System.out.println(num);
        }
    }
}
