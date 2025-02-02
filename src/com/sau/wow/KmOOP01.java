package com.sau.wow;

public class KmOOP01 {
    //data member (field , attribute , property) คุณสมบัติ/ลักษณะ
    public int a;
    public double b=10;
    public String c;
    
    //method member พฤติกรรม/การทำงานใดๆ
    public void ShowHello() {
        System.out.println("Hello...");
    }
    
    public void CalSumAandBandC() {
        System.out.println(a+b+c);
    }
    
    //constructor
    public KmOOP01(int a, String c){
        this.a = a;
        this.c = c;
    }

    
}
