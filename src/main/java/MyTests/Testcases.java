package MyTests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testcases {
     SoftAssert sa=new SoftAssert();
	@Test
	public void test1()
	{
		SoftAssert sa1=new SoftAssert();
		System.out.println("open browser");
		Assert.assertEquals(true, true);
		
		System.out.println("enter user name");
		System.out.println("enter password");
	    System.out.println("click on sign button");
	    Assert.assertEquals(true, true);
	    
	    System.out.println("validate home page");
	    sa1.assertEquals(true, false, "home page title is missing");//soft assertion
	    
	    System.out.println("go to deals page ");
	    System.out.println("create a deal");
	    sa1.assertEquals(true, false,"not able to create a deal");//soft assertion
	    
	    System.out.println("go to conact page");
	    System.out.println("crate a contact");
	    sa1.assertEquals(true, false,"not able to create a contact");//soft assertion
	    
	    sa1.assertAll();
	    
	}
	@Test
	public void test2()
	{
		SoftAssert sa2=new SoftAssert();
		System.out.println("logout");
		sa2.assertEquals(true, false);
		sa2.assertAll();
	}
	
	@AfterClass
	public void teardown()
	{}
}
