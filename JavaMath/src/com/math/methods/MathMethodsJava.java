package com.math.methods;

public class MathMethodsJava{
    
    public static void main(String[]args){
        int x = 5, y = 10;
        int z = Math.max(x, y); //finding the highest value...
        System.out.println(z);
        
        int e = Math.min(x, y);//finding the lowest value...
        System.out.println(e);
        
        double a = Math.sqrt(y);// square root of number
        System.out.println(a);
        
        double r = Math.abs(-4.7);//returns positive value...
        System.out.println(r);
        
        System.out.println(Math.random());
        
    }
}