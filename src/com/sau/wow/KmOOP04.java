package com.sau.wow;

public class KmOOP04 {
    public int a = 10;
    public static int b= 20; //ทุก Object ใช่ร่วมกัน
    public final int c = 30; //final คือเปลี่ยนค่าไม่ได้
    
    public void showA(){
        System.out.println(a);
    }
    
    public static void showB(){
        System.out.println(b);
    }
    
    public void met1(){
        a = 100;
        showA();
        b = 200;
        showB();
    }
    
    public static void met2(){ //static ใช้ได้เฉพาะที่เป็น Static เหมือนกันเท่านั้น
        
        //a= 111;
        b = 222;
        //showA();
        showB();
    
    }
    
}
