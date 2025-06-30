package com.osman;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();

		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//Xpath with single attribute
			//driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("TShirts");
	
		//Xpath with multiple attributes
		 //driver.findElement(By.xpath("//input[@id='small-searchterms'][@placeholder='Search store']")).sendKeys("Tshirts");
		 
		//xpath with 'and'  'or'  operator
		
		//driver.findElement(By.xpath("//input[@id='small-searchterms' and @placeholder='Search']")).sendKeys("Tshirts");
		//driver.findElement(By.xpath("//input[@id='small-searchterms' or @placeholder='xyz']")).sendKeys("Tshirts");
		
		//xpath with text() - inner text
		
		//driver.findElement(By.xpath("//*[text()='Apple MacBook Pro']")).click();
		//https://demo.opencart.com/
		/*boolean displaystatus=driver.findElement(By.xpath("//*[text()='Featured products']")).isDisplayed();
		System.out.println(displaystatus);
		
		String value=driver.findElement(By.xpath("//*[text()='Featured products']")).getText();
		System.out.println(value);
		*/
		
		
			
			
		//xpath with contains()
		//Search
			
		//driver.findElement(By.xpath("//input[contains(@placeholder,'Sea')]")).sendKeys("Tshirts");
		
		//xpath with start-with()
		//driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sea')]")).sendKeys("Tshirts");
		
		
		
			//chianed xpath
		 boolean status=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		System.out.println(status);
		
		
		
		
	}

}
