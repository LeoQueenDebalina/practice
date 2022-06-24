package com.oops.thisKeyword;
class Debalina{
    void m(){
        System.out.println(this);
    }
}
public class CurrentClassInstatnce {
    public static void main(String[] args) {
       Debalina debi =  new Debalina();
       System.out.println(debi);
       debi.m();
    }
}
