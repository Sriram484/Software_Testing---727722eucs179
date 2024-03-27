package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");
        Thread.sleep(3000);
        driver.get("https://www.msn.com/en-in/feed");
        Thread.sleep(3000);
        driver.get("https://www.mozilla.org/en-US/");
        Thread.sleep(3000);++++++++++++++++++++++++++

        driver.close();

    }
}
