package com.advanced;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Test_001 {

	WebDriver driver;
	
	@BeforeTest
	public void setUp() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Full Backup\\Official\\Testing tools Skill Set\\Selenium\\Selenium Installables Files\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
	
	@Test
	public void openBrowser()
	{
		driver.get("http://store.demoqa.com/");
        System.out.println("Current page title is: "+driver.getTitle());
	}
}
