package com.BasicJava;

public class PassingAruginmethod {
		// TODO Auto-generated method stub
     int employeeId ;
     String employeename ;
     
     
     public void inserttestdata(int Id,String name)
     {
    	 employeeId = Id;
    	 employeename = name;
    	 
    	 
     }
     
     public void displayinformation()
     { 
    	 System.out.println("The employeeid is : " + employeeId);
    	 System.out.println("The Empoyeename is: " + employeename);
     }
		
 	public static void main(String[] args) 
 	{
 		
 		PassingAruginmethod p1 = new PassingAruginmethod();
 		
 		p1.inserttestdata(101,"suma");
 		p1.displayinformation();
 		p1.inserttestdata(101, "namish");
 		p1.displayinformation();
	}

}
