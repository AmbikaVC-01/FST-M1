package com.example.fst_m1_selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity10 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://v1.training-support.net/selenium/dynamic-controls");
		System.out.println("Title of the page is:" + driver.getTitle());
		//WebElement inputElement = driver.findElement(By.xpath("//*[@id=\"dynamicCheckbox\"]/input"));
		//wait.until(ExpectedConditions.visibilityOf(inputElement));
		WebElement checkbox = driver.findElement(By.className("willDisappear"));
      
        WebElement checkboxToggle = driver.findElement(By.id("toggleCheckbox"));
        checkboxToggle.click();
        
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("willDisappear")));
        System.out.println("Checkbox is displayed: " + checkbox.isDisplayed());
       
        checkboxToggle.click();
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dynamicCheckbox")));
        System.out.println("Checkbox is displayed: " + checkbox.isDisplayed());
    
        driver.findElement(By.xpath("//input[@class='willDisappear']")).click();

        driver.close();
    }

	}


