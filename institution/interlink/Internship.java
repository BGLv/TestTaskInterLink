package institution.interlink;

import person.Student;
import java.util.Vector;

public class Internship {
    private String name;
    private Vector<String> students;

    public Internship(String name) {
        this.name=name;
        this.students=new Vector<String>();
    }

    public void setStudent(Student student) {
       if(this.students.indexOf(student)==-1)
            students.addElement(student.getMyName());
    }

    public String getStudents() {
        String res=new String();
        for(String person : this.students)
            res=res.concat(person.concat("\n"));
        return res;
    }
}

