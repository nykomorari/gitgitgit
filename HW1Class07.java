package com.syntax;

import com.syntax.Class05.WebDriverCommands;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class HW1Class07 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/window-popup-modal-demo.php");
        driver.manage().window().maximize();

        Thread.sleep(2000);
       WebElement ins = driver.findElement(By.xpath("//a[@title='Follow @syntaxtech on Instagram']'"));
       WebElement face = driver.findElement(By.xpath("//a[@title='Follow @syntaxtech on Facebook']"));


        ins.click();
       Thread.sleep(2000);
       driver.switchTo().defaultContent();
       Thread.sleep(2000);

        face.click();
       driver.switchTo().defaultContent();
       Thread.sleep(2000);
        Set<String> allWindowsHandles = driver.getWindowHandles();

        Iterator<String> it = allWindowsHandles.iterator();
        String mainPaigeHandle = it.next();
        String instHandle = it.next();
        String faceHandle = it.next();

        System.out.println("Main page handle is : "+mainPaigeHandle);
        System.out.println("Ins handle is : "+instHandle);
        System.out.println("Face handle is : "+faceHandle);

        driver.quit();






    }
}
