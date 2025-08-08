package ex_31_Collection_Framework_DSA.Lists;

import java.util.ArrayList;
import java.util.List;

public class Student_ArrayList {
    public static void main(String[] args) {

        Student s1 = new Student("Amit","1");
        Student s2 = new Student("Ritwik","2");
        Student s3 = new Student("Shubham","3");

        List <Student> myStudent = new ArrayList<>();
        myStudent.add(s1);
        myStudent.add(s2);
        myStudent.add(s3);

        System.out.println(myStudent);
    }
}
class Student {
    private String name;
    private String rollno;

    public Student (String name, String rollno){
        this.name = name;
        this.rollno = rollno;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getRollno() {
        return rollno;
    }
    public void setRollno(String rollno) {
        this.rollno = rollno;
    }
    @Override
    public String toString(){
        return "Student{" +
                "name = '" + name + '\'' +
                ", rollno = '" + rollno + '\'' +
                '}';
    }
}