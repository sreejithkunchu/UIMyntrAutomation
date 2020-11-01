package com.org.interviewProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    protected WebDriver driver;

    @BeforeTest
    public WebDriver init(){
        System.setProperty("webdriver.chrome.driver","/Users/sreejithkunchu/Documents/chromedriver");
        this.driver =  new ChromeDriver();
        return this.driver;
    }

    @AfterTest
    public void quitDriver() {
        this.driver.quit();
    }

}
