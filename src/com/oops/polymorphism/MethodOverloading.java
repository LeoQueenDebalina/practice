package com.oops.polymorphism;
class Load{
    public int sum(int a, int b, int c){
        return(a+b+c);
    }
    public float sum(float a, float b){
        return(a+b);
    }
    public int sum(int a, int b){
        return(a+b);
    }
    public float sum(float a, float b, float c){
        return(a+b+c);
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
    Load l = new Load();
    System.out.println(l.sum(4,8));
    System.out.println(l.sum(7.8f,9.0f));
    System.out.println(l.sum(4,8,9));
    System.out.println(l.sum(4.0f,8.9f,7.8f));
    }
}
