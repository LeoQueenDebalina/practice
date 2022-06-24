package com.oops.polymorphism;
class School{
    void Open(){
        System.out.println("The school is open");
    }
}
class Class extends School{
    void Open(){
        System.out.println("The class is running");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        Class c = new Class();
        c.Open();
    }
}
