package project.personal.Introduction.ObjectOrientation.StudentAndProfessorClasses.test;

import project.personal.Introduction.ObjectOrientation.StudentAndProfessorClasses.domain.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.name = "John";
        professor.age = 42;
        professor.sex = 'M';

        System.out.println("Nome: " +professor.name + " age: " + professor.age + " Sex: " + professor.sex);
    }
}
