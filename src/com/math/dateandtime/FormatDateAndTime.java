package com.math.dateandtime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatDateAndTime {
    
       public static void main(String[]args){
           LocalDateTime dateTime = LocalDateTime.now();
           System.out.println("Before format: "+ dateTime);
           
           DateTimeFormatter formatted = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
           String formattedTimeDate = dateTime.format(formatted);
           System.out.println("After format: "+ formattedTimeDate);
       }
}
/*
Other patterns
yyyy-MM-dd   1998-09-29
dd/MM/yyyy   29/09/1988
dd-MMM-yyyy  29-Sep-1988
E, MMM dd    Thu, Sep 29 1988
yyyy
*/