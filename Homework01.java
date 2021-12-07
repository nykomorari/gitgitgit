package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.util.List;
import java.util.Set;

public class Homework01 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
            driver.findElement(By.id("customer.firstName")).sendKeys("Nicolae");
            driver.findElement(By.id("customer.lastName")).sendKeys("Morari");
            driver.findElement(By.id("customer.address.street")).sendKeys(("2021 65 Street"));
            driver.findElement(By.id("customer.address.city")).sendKeys("Brooklyn");
            driver.findElement(By.id("customer.address.state")).sendKeys("NY");
            driver.findElement(By.id("customer.address.zipCode")).sendKeys("11200");
            driver.findElement(By.id("customer.phoneNumber")).sendKeys("929394395439");
            driver.findElement(By.id("customer.ssn")).sendKeys("-999-99-9999");
            driver.findElement(By.id("customer.username")).sendKeys("hdhdsjs");
            driver.findElement(By.id("customer.password")).sendKeys("8282jghsd");
            driver.findElement(By.id("repeatedPassword")).sendKeys("8282jghsd");
            driver.findElement(By.className("button")).click();
            driver.close();

    }
}
