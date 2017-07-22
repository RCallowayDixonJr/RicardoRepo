package com.example.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WikipediaTest1 {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}

	@Test
	public void wikiTest() throws Exception
	{
		driver.get("https://www.wikipedia.org/");
		Thread.sleep(2*1000);
		driver.findElement(By.id("js-link-box-en")).click();
		Thread.sleep(2*1000);
		WebElement searchBox = driver.findElement(By.name("search"));
		searchBox.clear();
		searchBox.sendKeys("Disney's Fillmore");
		Thread.sleep(2*1000);
		driver.findElement(By.className("searchButton")).click();
	}
	
	
	
	@AfterMethod
	public void teardown() throws Exception
	{
		Thread.sleep(8*1000);
		driver.close();
		driver.quit();
		
	}
	
	
	
}
