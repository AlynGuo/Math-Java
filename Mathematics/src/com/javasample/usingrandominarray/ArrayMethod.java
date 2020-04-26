package com.javasample.usingrandominarray;

public class ArrayMethod{
    
    public static void main(String[]args){
        int me[] = {3,4,5,6,7};
        change(me);
        
        for(int y: me){
            System.out.println(y);
        }
        
    }
        public static void change(int x[]){
            for(int counter = 0; counter < x.length; counter++ ){
                x[counter] += 5;
            }
        }
    }
