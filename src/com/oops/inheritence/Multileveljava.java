package com.oops.inheritence;

class Electronics {
    public Electronics(){
        System.out.println("Electronics");
    }

}
class Computer extends Electronics{
    public Computer(){
        System.out.println("Computer");
    }
    public void category(){
        System.out.println("Category-Computer");
    }
}

class CRT extends Computer{
    public CRT(){
        System.out.println("this is CRT computer");
    }
    public void price(){
        System.out.println(" price = 20k");
    }
}

public class Multileveljava {
    public static void main(String[] args) {
        CRT crt = new CRT();
        crt.category();
        crt.price();
    }
}
