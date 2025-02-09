package com.sau.wow;

public class Test02 {
    public static void main(String[] args) {
        //1
        KmOOP02 ob1;
        ob1 = new KmOOP02(10, 20);
        
        //2
        KmOOP02 ob2 = new KmOOP02(10, 50);
        
        KmOOP02 ob3 = new KmOOP02(10, 20);
        
        //การใช้งาน object/Instance คือการใช้งาน Data/Method
        //การใช้งาน Data คือการนำค่ามาใช้ หรือ กำหนดค่าให้ใหม่
        //การใช้งาน medthod คือ สั่งให้ medthod นั้นทำงาน
        
        System.out.println(ob1.a + ob2.b);
        ob1.a = 100;
        System.out.println(ob1.a + ob2.b);
        
        ob2.showB();
        ob1.showA();
        
    }
    
}
