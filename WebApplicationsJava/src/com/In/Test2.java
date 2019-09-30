package com.In;

public class Test2   extends Test1
{
	
	public void method3()
	{
		System.out.println("Method3 executed successfully");
	}
	
private void method4()
	{
		
		System.out.println("Method4 executed successfully");
	}
	
	protected void method5()
	{
		System.out.println("Method5 executed successfully");
	}
	
	public  static void main(String[] args)
	{
		Test2 t2 = new Test2();
		t2.method1();
		t2.method2();
		t2.method3();
		t2.method4();
		t2.method5();
		
	}
}
