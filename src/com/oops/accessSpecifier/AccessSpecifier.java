package com.oops.accessSpecifier;
class CIT{
    int x = 1;
    public String str = "Debalina";
    private int password = 101;
    protected String subject = "Java";
    public void setPassword(int password){
        this.password = password;
    }
    public int getPassword(){
        return password;
    }
}

public class AccessSpecifier {
    public static void main(String[] args) {
     CIT cit = new CIT();
     System.out.println("Student name is "+cit.str+" "+"roll no is"+" "+cit.x+" password is"+" "+cit.getPassword()+" subject is "+cit.subject);
    }
}
