package com.example.fst_m1_selenium;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new FirefoxDriver();
		
		Actions builder = new Actions(driver);
		driver.get("https://v1.training-support.net/selenium/input-events");
		System.out.println("Home page Title:" + driver.getTitle());
		builder.sendKeys("s").build().perform();
		  // Press CTRL+A and CTRL+C
		builder.keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		driver.quit();
	}
	

}
