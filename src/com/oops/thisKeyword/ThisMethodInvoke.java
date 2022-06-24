package com.oops.thisKeyword;
class Hello{
    void m(){
        System.out.println(" Hello m ");
    }
    void n(){
        System.out.println(" Hello n ");
        this.m();
    }
}
public class ThisMethodInvoke {
    public static void main(String[] args) {
        Hello hello = new Hello();
        hello.n();
    }
}
