package com.osman.waits;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

//import com.google.common.base.Function;


public class FluentWaitDemo {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		//declaration
		 Wait<WebDriver> mywait = new FluentWait<WebDriver>(driver)
			       .withTimeout(Duration.ofSeconds(10))
			       .pollingEvery(Duration.ofMillis(500))
			       .ignoring(NoSuchElementException.class);
		
				
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
			
		
		 WebElement txtusername = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));

		   
		 txtusername.sendKeys("Admin");

	}

}
