package com.example.fst_m1_selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


class Activity9 {
  
	 public static void main(String[] args) {
		 // TODO Auto-generated method stub
		 WebDriver driver = new FirefoxDriver();
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		 driver.get("https://v1.training-support.net/selenium/ajax");
		 System.out.println("Title of the paage is:" +driver.getTitle());
		 WebElement button = driver.findElement(By.xpath("//*[@id=\"ajax-content\"]/button"));
		 button.click();
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h1")));
	     String text = driver.findElement(By.tagName("h1")).getText();
	     System.out.println(text);
	     WebElement delayedText = driver.findElement(By.tagName("h3"));
	     System.out.println(delayedText.getText());
	     wait.until(ExpectedConditions.textToBePresentInElementLocated(By.tagName("h3"), "I'm late!"));
	     String lateText = driver.findElement(By.tagName("h3")).getText();
	     System.out.println(lateText);
	     driver.quit();
		 
		
	 }
}
