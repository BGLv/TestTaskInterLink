package person;

import person.consciousness.Knowledge;

public class Student {
    private String myName;
    private Knowledge myKnowledge;
    public Student(String name) {
        this.myName=name;
        this.myKnowledge=new Knowledge(0);
    }

    public void setKnowledge(Knowledge knowledge) {
        this.myKnowledge.setLevel(knowledge.getLevel());
    }

    public String getMyName() {
        return myName;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }

    public Knowledge getMyKnowledge() {
        return myKnowledge;
    }
}
