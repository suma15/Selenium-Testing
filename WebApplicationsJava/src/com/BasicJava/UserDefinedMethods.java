package com.BasicJava;

public class UserDefinedMethods {

		// TODO Auto-generated method stub
	
	
	int a = 20;
	int b = 5;
	int c =a+b;
	int d =a-b;
	int e = a*b;
	int f =a/b; 
	
		
		public static void main(String[] args) 
		{

			UserDefinedMethods u1 = new UserDefinedMethods();
			u1.test2();	
			u1.test1();
			u1.test3();
			u1.test4();
	}
		
		
		public void test2()
		{
			
			System.out.println("method test2 is successfully executed" + " "+ c);
		}
		public void test1()
		{
	
		System.out.println("method test1 is successfully executed" +" "+  d);
	}
		
		
		public void test3()
		{
	
		System.out.println("method test3 is successfully executed" +" "+  e);
	}
		
		public void test4()
		{
	
		System.out.println("method test4 is successfully executed" + " "+ f);
	}


		}


