package project.personal.Introduction.FixationExercises.OrientationObjectsExercise.Classes.CarTest;

import project.personal.Introduction.FixationExercises.OrientationObjectsExercise.Classes.domain.Car;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car();
        Car car2 = new Car();

        car.mark = "Porsche";
        car.model = "Carrera";
        car.yearOfFabrication = 2004;

        //car = car2; with this line of code,  Car now references the value of Car2 references

        car2.mark = "Ferrari";
        car2.model = "458 Italia";
        car2.yearOfFabrication = 2010;

        System.out.println("Mark: " + car.mark + "\nModel: " + car.model + "\nYear of Fabrication: " + car.yearOfFabrication);
        System.out.println("\nMark: " + car2.mark + "\nModel: " + car2.model + "\nYear of Fabrication: " + car2.yearOfFabrication);
    }
}
