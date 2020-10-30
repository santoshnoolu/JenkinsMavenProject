package com.santosh.JenkinsMavenProj;

import java.io.IOException;
import java.lang.reflect.Method;

import org.json.simple.parser.ParseException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import JsonReader.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass4 {
	public WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
	}
	@Test
	public void test41() throws IOException, ParseException
	{
	driver.get(DataTable.getData("url"));
	driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys(DataTable.getData("SearchText"));
	driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@value='Google Search']")).click();
	}
	
	@Test
	public void test42() throws IOException, ParseException
	{
	driver.get(DataTable.getData("url"));
	driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys(DataTable.getData("SearchText"));
	driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@value='Google Search']")).click();
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
