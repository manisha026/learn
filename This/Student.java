import java.util.*;
class Student{
    int rollno;
    String name;
    String course;
    float fee;
    Student(int rollno, String name, String course){
        this.rollno=rollno;
        this.name=name;
        this.course=course;
    }
    Student(int rollno, String name, String course, float fee){
        this(rollno,name,course);
        this.fee=fee;
    }
    void display(){
        System.out.println(rollno+"   "+name+"   "+course+"   "+fee);
    }
    public static void main(String args[]){
        Student s1=new Student(26,"manisha", "cse");
        Student s2=new Student(22,"anshu","ece", 35689);
        s1.display();
        s2.display();
    }
}