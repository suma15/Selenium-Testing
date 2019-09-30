package com.BasicJava;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 1
 *  1 2
 *  1 2 3
 *  */
		
		  for (int i = 1; i <= 3; i++)
	        {
	            for (int j = 3; j > i; j--)
	            {
	                System.out.print(" ");
	            }
	            for (int k = 1; k <= i; k++)
	            {
	                System.out.print(k + " ");
	            }
	            System.out.println();
	}

	}
}
