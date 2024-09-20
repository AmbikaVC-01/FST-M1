package com.example.fst_m1_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;

public class Activity12 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new FirefoxDriver();
		driver.get("https://v1.training-support.net/selenium/dynamic-controls");
		System.out.println("Title of the page is:" + driver.getTitle());
		WebElement Enable_Input = driver.findElement(By.id("input-text"));
		System.out.println("Input field is Enabled:" + Enable_Input.isEnabled());
		driver.findElement(By.id("toggleInput")).click();
		System.out.println("Input field is Enabled:" + Enable_Input.isEnabled());
		driver.quit();
	}

}
