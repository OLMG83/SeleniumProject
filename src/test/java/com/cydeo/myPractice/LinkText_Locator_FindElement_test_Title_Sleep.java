package com.cydeo.myPractice;

import com.cydeo.utilities.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText_Locator_FindElement_test_Title_Sleep {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // for open page
        driver.get("https://beginnersbook.com/java-tutorial-for-beginners-with-examples/");
        // find element we do copy from inspect --> click 2 time--> and copy element
        WebElement titleHome = driver.findElement(By.linkText("Home"));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        titleHome.click();
        //Verify title

        String expectedTitle = "Our Top Picks";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title verification Passed!");
        } else {
            System.out.println("title verification Fail!");


            // return back in the page
            driver.navigate().back();

            expectedTitle = "Practice return back";
            actualTitle = driver.getTitle();

            if (actualTitle.equals(expectedTitle)) {
                System.out.println("Title verification Passed!");
            } else {
                System.out.println("title verification Fail!");


            }

        }
    }
}
