package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.partialLinkText("Create new account")).click();
        WebElement FirstName = driver.findElement(By.name("firstname"));
        FirstName.sendKeys("Nicolae");
       WebElement LastName = driver.findElement(By.name("lastname"));
       LastName.sendKeys("Morari");
        driver.findElement(By.linkText("Mobile number or email")).sendKeys("929-4535-3453");
        driver.findElement(By.name("birthday_month")).sendKeys("Oct");
        driver.findElement(By.name("birthday_day")).sendKeys("05");
        driver.findElement(By.name("birthday_year")).sendKeys("1995");
        driver.findElement(By.xpath("//input[@value ='2']"));
        driver.findElement(By.linkText("Sign Up")).click();
        driver.close();




    }
}
