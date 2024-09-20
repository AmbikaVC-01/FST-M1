package com.example.fst_m1_selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity14 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new FirefoxDriver();
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	        // Open the page
	        driver.get("https://v1.training-support.net/selenium/tables");
	        // Print the title of the page
	        System.out.println("Home page title: " + driver.getTitle());

	        // Print the number of columns
	        List<WebElement> cols = driver.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr[1]/td"));
	        System.out.println("Number of columns: " + cols.size());
	        // Print the number of rows
	        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr"));
	        System.out.println("Number of rows: " + rows.size());

	        // Print the cell value of the second row and second column
	        WebElement cellValue = driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]"));
	        System.out.println("Second row, second cell value: " + cellValue.getText());

	        // Sort the table
	        driver.findElement(By.xpath("//table[@id='sortableTable']/thead/tr/th")).click();

	        // Print the cell value of the second row and second column again
	        cellValue = driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]"));
	        System.out.println("Second row, second cell value: " + cellValue.getText());

	        // Print the cell values of the footer
	        List<WebElement> footer = driver.findElements(By.xpath("//table[@id='sortableTable']/tfoot/tr/th"));
	        System.out.println("Cell values of the footer: ");
	        for(WebElement cell : footer) {
	            System.out.println(cell.getText());
	        }

	        // Close the browser
	        driver.quit();
	}

}

