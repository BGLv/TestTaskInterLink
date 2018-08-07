package institution;

import person.Student;

import java.util.Random;
import java.util.Vector;

public class University {
    private String nameOfUniversity;
    private Vector<Student> students;
    private double average;
    private void calculateAverage(){
        double temp=0;
        for(int i=0; i< this.students.size();i++)
            temp+=this.students.get(i).getMyKnowledge().getLevel();
        this.average=temp/this.students.size();
    }
    private static int getRandomNumberInRange(int min, int max){
        if(min>=max)
           return 0;
        Random r = new Random();
        return r.nextInt((max-min)+1+min);
    }
    public University(String name) {
        this.nameOfUniversity=name;
        this.students=new Vector<Student>();
        this.average=0;
    }

    public void setStudent(Student student) {
        if(this.students.indexOf(student)!=-1)
        {
            this.students.get(this.students.indexOf(student)).getMyKnowledge().setLevel(getRandomNumberInRange(1,100));
            this.calculateAverage();
        }
    }

    public void addStudent(Student student) {
        if(this.students.indexOf(student)==-1)
            this.students.addElement(student);
    }

    public Vector<Student> getStudentsForIntership() {
        Vector<Student> res = new Vector<Student>();
        for(int i=0;i<this.students.size();i++)
        {
            if(this.students.get(i).getMyKnowledge().getLevel()>this.average)
                res.add(this.students.get(i));
        }
       return res;
    }
}
