package com.BasicJava;

public class Arraymutlidimensionalexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String array1[][] = new String[2][2];
		array1[0][0]="Manual testing";
		array1[0][1]="venkatesh";
		array1[1][0]="Selenium";
		array1[1][1]="sumalatha";
		
		
		for(int i=0;i<2;i++)
		{
			
			for(int j=0;j<2;j++)
				
			{
				 
				System.out.print(array1[i][j]  + " ");
		
			}
			System.out.println();
		}
	}

}
