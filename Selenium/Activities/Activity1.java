package com.example.fst_m1_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
		 WebDriver driver = new FirefoxDriver();
			driver.get("https://v1.training-support.net");
			 System.out.println(driver.getTitle());
            driver.findElement(By.id("about-link")).click();
            System.out.println(driver.getTitle());
            driver.quit();
            
     }
}