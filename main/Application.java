package main;

import institution.University;
import institution.interlink.Internship;
import person.Student;

public class Application {
    public static void main(String[] args) {
        University university = new University("CH.U.I.");
        Student st1=new Student("Andrew Kostenko");
        Student st2=new Student("Julia Veselkina");
        Student st3=new Student("Maria Perechrest");
        university.addStudent(st1);
        university.addStudent(st2);
        university.addStudent(st3);
        university.setStudent(st1);
        university.setStudent(st2);
        university.setStudent(st3);

        Internship internship = new Internship("Interlink");

        for(Student person : university.getStudentsForIntership())
            internship.setStudent(person);

        System.out.println("List of internship's students:");
        System.out.println(internship.getStudents());
    }
}
