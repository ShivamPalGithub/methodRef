package com.example.crud.re;

public class RefDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("refernces method");
		/*
		 * // provide the implementation of WoInter WoInter inter=()->{
		 * System.out.println("this doTask method"); };
		 */
//         static method refernces
		
		  WoInter inter2 = Stuff::dosuff; 
		  inter2.doTask();
			/*
			 * Runnable readable = Stuff::threadTask; Thread thread = new Thread(readable);
			 * thread.start();
			 */
		Stuff ob = new Stuff();
		Runnable readable1 = ob::printNumber;
		
		Thread thread1 = new Thread(readable1);
		thread1.start();


	}

}
