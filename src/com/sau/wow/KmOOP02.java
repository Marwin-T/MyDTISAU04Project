package com.sau.wow;

public class KmOOP02 {
    
    //Data Member
    public int a = 10;
    public int b;
    public int c;
    
    //Medthod Member
    public void showA(){
        System.out.println(a);
    }
    
    public void showB(){
        System.out.println(b);
    }
    
    public void showSumAB(){
        System.out.println(a + b);
    }

    //constuctor
    public KmOOP02(int b, int c){
        this.b = b;  //this ใช้แทน class
        this.c = c;
        System.out.println("Hello..." + a);
    
    }
    
}
