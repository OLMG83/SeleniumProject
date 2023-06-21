package com.cydeo.myPractice;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FindElement {
    public static void main(String[] args) {


        // we will to Open browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

     driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //2- Go to:https://www.amazon.com/
        driver.get("https://www.amazon.com/");

    }
}