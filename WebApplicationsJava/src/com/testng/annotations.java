package com.testng;

import org.testng.annotations.Test;

public class annotations {
	@Test(priority=1)
	  public void gmailapplicationlauch() {
		  System.out.println("gmail application launch");
	  }
	  
	  
	  @Test(priority=2)
	  
	  public void inbox()
	  {
		System.out.println("Testing inbox");  
	  }
	  

	  
	  @Test(priority=3)
	  
	  public void compmail()
	  {
		  System.out.println("Testing drafts functionality");
	  }
	  
	  @Test(enabled=false)
	  
	  public void drafts()
	  {
		  System.out.println("Testing dratfs functionality");
	  }
}
