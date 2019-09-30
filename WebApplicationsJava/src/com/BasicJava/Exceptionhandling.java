package com.BasicJava;

public class Exceptionhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try
		{
		int x=10;
		int y=0;
		int z;
		z=x/y;
		System.out.println("the value of z is:"+z);

	}
		catch(Exception  expression)
		{
			System.out.println("Cannot perform the operation");
			
			System.out.println("The Exception is :"+expression);
		}


}
	
}
	