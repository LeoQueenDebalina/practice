package com.oops.inheritence;

import java.awt.*;

class Students{
    public void Study(){
        System.out.println("Subjects");
    }
}
class GraduateStudents extends Students{
    public void Studies(){
        System.out.println("Specific subjects");
    }
}
class PostGraduateStudents extends Students{
    public void Studious() {
        System.out.println("Only One Subject");
    }
}
public class Hierarchyjava {
    public static void main(String[] args) {
        PostGraduateStudents pgs = new PostGraduateStudents();
        GraduateStudents gs = new GraduateStudents();
        pgs.Study();
        pgs.Studious();
        gs.Study();
        gs.Studies();
    }
}
