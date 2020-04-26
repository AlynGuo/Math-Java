package com.math.dateandtime;
import java.time.LocalDateTime;

public class DisplayCurrentDateAndTime {
      
     public static void main(String[]args){
         LocalDateTime DateTime = LocalDateTime.now();
         System.out.println(DateTime);
     }    
}
