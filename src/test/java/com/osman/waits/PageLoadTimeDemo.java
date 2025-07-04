package com.osman.waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageLoadTimeDemo {

	public static void main(String[] args) {


		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement usernameInput = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']"))
		);

		usernameInput.sendKeys("Admin");

//		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");

	}

}