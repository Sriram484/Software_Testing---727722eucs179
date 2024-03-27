package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        WebDriverManager.chromiumdriver().setup();
        WebDriver driver = new InternetExplorerDriver();
        
        
        driver.get("https://www.shoppersstop.com/");

        WebElement profiElement= driver.findElement(By.xpath("//*[@id='profileImage']/a"));
        profiElement.click();
        
        driver.quit();
    }
}
