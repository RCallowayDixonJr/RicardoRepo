package com.selenium.git;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GitPractice {
	
	
	WebDriver driver;
	
	@Test
	public void setUpBrowser()
	{
		driver = new ChromeDriver();
		driver.get("http://www.allthingsbeyond.com/");
	}

}
