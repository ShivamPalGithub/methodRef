package com.example.crud.re;

import java.time.LocalDate;

public class Stuff {
     public static void dosuff() {
    	 System.out.println("I am doing task");
    LocalDate date=	 LocalDate.now();
    System.out.println(date.toString());
     }
     
     public static void threadTask() {
    	 for(int i=1;i<=10;i++)
    	 {
    		 System.out.println(2*i);
    		 try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	 }
     }
     
     

     public  void printNumber() {
    	 for(int i=1;i<=10;i++)
    	 {
    		 System.out.println(i);
    		 try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	 }
     }
}
