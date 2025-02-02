package com.sau.wow;

public class Test01 {

    public static void main(String[] args) {
        //สร้าง Object มี 2 แบบ

        //แบบที่ 1 มี 2 step
        KmOOP01 obA; //ประกาศชื่อ
        obA = new KmOOP01(10, "EIEI"); 
            //นำชื่อที่ประกาศมาสร้างโดนใช้ new
        
        //แบบที่ 2
        KmOOP01 obB = new KmOOP01(20, "^_^");
        
        KmOOP01 obC = new KmOOP01(20,"T_T");
        
        KmOOP01 obD = new KmOOP01(20, "^_^");
        
        obB.a = 1000;
        System.out.println(obB.c);
        
        obC.c = "Wow";
        System.out.println(obC.c);
        

    }
    
}
