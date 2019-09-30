package com.BasicJava;

public class Switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int weekday =4;

switch(weekday)
{
case 1:
	System.out.println("Monday");
break;

case 2:
	
	System.out.println("Tuesday");
	break;
	
case 3:
	System.out.println("Wednesday");
	break;
	
case 4:
	System.out.println("thursday");
	break;
	
case 5:
	System.out.println("friday");
	break;
	
case 6:
     System.out.println("saturday");
     break;
     
case 7:
	System.out.println("sunday");
	break;
	
	default:
		System.out.println("no matching found");
		System.out.println("not a weekday");
		
		break;
}
	}

}
