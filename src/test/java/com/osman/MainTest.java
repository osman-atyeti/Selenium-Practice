package com.osman;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class MainTest {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.nopcommerce.com/");

        if (driver.getTitle().equals("nopCommerce demo store. Home page title")) {
            System.out.println("Title is correct: " + driver.getTitle());
        } else {
            System.out.println("Title is incorrect: " + driver.getTitle());
        }

        driver.quit();

    }

}