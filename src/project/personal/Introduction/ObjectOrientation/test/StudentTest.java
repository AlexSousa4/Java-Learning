package project.personal.Introduction.ObjectOrientation.test;

import project.personal.Introduction.ObjectOrientation.domain.Student;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Alex";
        student.age = 24;
        student.sex = 'M';
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.sex);
    }
}
