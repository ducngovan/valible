package com.codegym;

public class Main {

    public static void main(String[] args) {
	getVaridate bien =  new getVaridate();
	bien.getOut();
    }
}
class getVaridate{
    int i = 10;
    float f = 20.5f;
    double d = 20.5;
    boolean b = true;
    char c = 'a';
    String s = "Hà Nội";
    public void getOut(){
        System.out.println("i = " + i);
        System.out.println("f = " + f);
        System.out.println("d = " + d);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("s = " + s);
    }
}