package com.example.fst_m1_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;

public class Activity11 {
     public static void main(String[] args) {
    	 // TODO Auto-generated method stub
		 WebDriver driver = new FirefoxDriver();
    	 driver.get("https://v1.training-support.net/selenium/dynamic-controls");
    	 WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"dynamicCheckbox\"]/input"));
    	 checkbox.click();
    	 System.out.println("checkbox is selected:" + checkbox.isSelected());
    	 checkbox.click();
    	 System.out.println("checkbox is selected:" + checkbox.isSelected());
    	 driver.quit();
    	 
     }
}
