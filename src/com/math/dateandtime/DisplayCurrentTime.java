package com.math.dateandtime;
import java.time.LocalTime;

public class DisplayCurrentTime {
    
     public static void main(String[]args){
         LocalTime time = LocalTime.now();
         System.out.println(time);
     }    
}
