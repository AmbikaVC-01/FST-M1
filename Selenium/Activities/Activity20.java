package com.example.fst_m1_selenium;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Activity20 {
	public static void main(String[] args) {
		  // TODO Auto-generated method stub
		  WebDriver driver = new FirefoxDriver();
		  driver.get("https://v1.training-support.net/selenium/javascript-alerts");
		  System.out.println(" Alert page is:" +driver.getTitle());
		// Find and click the button to open the alert
	        driver.findElement(By.id("prompt")).click();

	        // Switch focus to the alert
	        Alert promtAlert = driver.switchTo().alert();

	        // Print the text in the alert
	        String alertText = promtAlert.getText();
	        System.out.println("Text in alert: " + alertText);
	        // Type into the alert
	        promtAlert.sendKeys("Awesome!");

	        // Close the alert by clicking OK
	        promtAlert.accept();

	        // Can also close the alert by clicking Cancel
	        // promtAlert.dismiss();

	        // Close the browser
	        driver.quit();
}
}
