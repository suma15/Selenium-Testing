package com.BasicJavaAssignments;

public class Pattern2 {

	public static void main(String[] args) {
// TODO Auto-generated method stub
		/*int i,j;
        i =1;
        
        while(i<=3)
        {
        	j=1;
        
        while(j<=i)
        {
        	System.out.println(j+ " ");
        }j++;


	}i++;

System.out.println();
System.out.println();
*/
		
	
		int i =1;
		do
		{
			int j =1;
		do
		{
			System.out.print(j +  " ");
			j++;
			
		}while(j<=i);
			
		System.out.println();
		i++;

		}while(i<=3);
}
}