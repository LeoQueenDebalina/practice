package com.oops.thisKeyword;
class Student{
    int roll;
    String name,course;
    float fee;
    Student(int roll,String name, String course){
        this.roll = roll;
        this.name = name;
        this.course = course;
    }
    Student(int roll,String name, String course, float fee){
        this(roll,name,course);
        this.fee = fee;

    }
    void display(){
        System.out.println(roll+" "+name+" "+course+" "+fee+" ");
    }
}
public class ThisConstructorInvoke {
    public static void main(String[] args) {


        Student s1 = new Student(1, "Tania", "DBMS");
        Student s2 = new Student(2, "Debalina", "Java", 4000);
        s1.display();
        s2.display();
    }
}
