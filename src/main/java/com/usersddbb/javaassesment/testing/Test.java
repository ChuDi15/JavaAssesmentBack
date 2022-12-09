package com.usersddbb.javaassesment.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
@org.junit.jupiter.api.Test
	public void TestShowUserList() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Daniel.Benitez\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000");


		driver.findElement(By.id("showUsersList")).click();
		driver.findElement(By.xpath("/html/body/div/div/div/ul/li[2]/a")).click();
		driver.findElement(By.xpath("/html/body/div/div/div/ul/li[3]/a")).click();
		driver.findElement(By.xpath("/html/body/div/div/div/ul/li[4]/a")).click();
		driver.findElement(By.xpath("/html/body/div/div/div/ul/li[5]/a")).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("/html/body/div/div/div/ul/li[1]/a")).click();
		driver.findElement(By.xpath("/html/body/div/div/div/ul/li[6]/a")).click();
		driver.findElement(By.xpath("/html/body/div/div/div/button")).click();
	
	}

@org.junit.jupiter.api.Test
public void TestCreateUser() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Daniel.Benitez\\Downloads\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://localhost:3000");


	
	driver.findElement(By.id("createUser")).click();

	 WebElement element1 = driver.findElement(By.id("inputFirstName"));
	 element1.sendKeys("firstnametest");
	 WebElement element2 = driver.findElement(By.id("inputLastName"));
	 element2.sendKeys("lastnametest");
	 WebElement element3 = driver.findElement(By.id("inputPhoneNum"));
	 element3.sendKeys("phonenumtest");
	 WebElement element4 = driver.findElement(By.id("inputEmail"));
	 element4.sendKeys("emailtest");
	 
	driver.findElement(By.xpath("/html/body/div/div/div/div[5]/input")).click();
	driver.findElement(By.xpath("/html/body/div/div/div/button[2]")).click();
	   
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}


}
}