package com.example.fst_m1_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		 WebDriver driver = new FirefoxDriver();
		
		driver.get("https://v1.training-support.net/selenium/target-practice");
		System.out.println(driver.getTitle());
		String ThrirdHeader = driver.findElement(By.xpath("//h3[contains(text(),'Third header')]")).getText();
		System.out.println(ThrirdHeader);
		String FifthHeader = driver.findElement(By.xpath("//h5[contains(text(),'Fifth header')]")).getText();
		System.out.println(FifthHeader);
		String Violet = driver.findElement(By.xpath("//div/button[contains(text(),'Violet')]")).getText();
		System.out.println(Violet);
		String Grey = driver.findElement(By.xpath("//div/button[contains(text(),'Grey')]")).getText();
		System.out.println(Grey);
		
	    driver.quit();
	}
	
}
