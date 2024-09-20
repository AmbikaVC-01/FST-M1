package com.example.fst_m1_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new FirefoxDriver();
		
		driver.get(" https://v1.training-support.net/selenium/login-form");
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("username")).sendKeys("admin");
		
		driver.findElement(By.id("password")).sendKeys("password");	
			
		driver.findElement(By.xpath("//div/button[contains(text(),'Log in')]")).click();
		
		String message=driver.findElement(By.id("action-confirmation")).getText();
		System.out.println("Login message:" + message);
		driver.quit();
	}

}
