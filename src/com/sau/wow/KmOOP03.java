package com.sau.wow;

public class KmOOP03 {
    public int a = 10;
    public int b;
    public int c;
    
    //overloading method
    public void showData(String x){
        System.out.println(x);
    }
    
    public void showData(String x, String y){
        System.out.println(x + y);
    }
    
    
    //class 1 class ที่มี Constuctor ที่ชื่อเดียวกัน มากกว่า 1 ตัว เรียกว่า Overloading constuctor
    
    public KmOOP03(){
        System.out.println("Hello...");
    
    }
    
    public KmOOP03(int b, int c){
        this.b = b;
        this.c = c;
        System.out.println("Hi...");
    }
    
    public KmOOP03(int a, int b, int c){
        System.out.println("Hey");
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
}
