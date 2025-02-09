package com.sau.wow;

public class Test04 {
    public static void main(String[] args) {
        KmOOP04 ob1 = new KmOOP04();    
        KmOOP04 ob2 = new KmOOP04();
        KmOOP04 ob3 = new KmOOP04();
        
        ob1.b = 222;
        ob2.b = 555;
        
        System.out.println(ob1.b);
        System.out.println(ob2.b);
        System.out.println(ob3.b);
        
        ob1.a = 999;
        System.out.println(ob1.a);
        System.out.println(ob2.a);
        System.out.println(ob3.a);
        
        KmOOP04.b = 55555;
        KmOOP04.showB();
        
        System.out.println(ob1.b);
        System.out.println(ob2.b);
        System.out.println(ob3.b);
        
        
    }
    
}
