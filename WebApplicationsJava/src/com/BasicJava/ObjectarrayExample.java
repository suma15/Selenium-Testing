package com.BasicJava;

public class ObjectarrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object array1[] = new Object[4];
		array1[0] =10;
		array1[1] = "selenium";
		array1[2] =12.435;
		array1[3]="a";
		for(int i=0;i<array1.length;i++)
		{
			
			System.out.println("-----------------");
	       for(Object var:array1)
	         {
			System.out.println(var);
		}

		
		}
		
	}

}
