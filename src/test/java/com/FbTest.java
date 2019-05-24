package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FbTest {
	 WebDriver driver;
	 @BeforeMethod
	 public void setup()
	 {
		 System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	      driver  = new ChromeDriver();
	      driver.get("https://www.facebook.com/");
	 }
	 @Test
	 public void FBtitleTest1()
	 {
		 String title=driver.getTitle();
		 System.out.println("title of the page--->"+title);
		 Assert.assertEquals(title, "Facebook – log in or sign up");
		 
	 }
	  
	 @Test
	 public void FBtitleTest2()
	 {
		 String title=driver.getTitle();
		 System.out.println("title of the page--->"+title);
		 Assert.assertEquals(title, "Facebook – log in or sign up");
		 
	 }
	 
	 @Test
	 public void FBtitleTest3()
	 {
		 String title=driver.getTitle();
		 System.out.println("title of the page--->"+title);
		 Assert.assertEquals(title, "Facebook – log in or sign up");
		 
	 }
	 
	 
	 @AfterMethod
	 public void teardown()
	 {
		 driver.quit();
	 }
	 
	 
}
