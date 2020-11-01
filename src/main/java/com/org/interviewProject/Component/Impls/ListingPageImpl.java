package com.org.interviewProject.Component.Impls;

import com.org.interviewProject.Component.ListingPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Set;

public class ListingPageImpl implements ListingPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public ListingPageImpl(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 30);
    }

    public void openBaseUrl(){
        driver.get("https://www.myntra.com/");
        wait.until(ExpectedConditions.visibilityOf(this.driver.findElement(mytraIcon)));
    }

    public void seletItem(String size){
        wait.until(ExpectedConditions.visibilityOf(this.driver.findElement(sizeIcon)));
        Actions actions = new Actions(this.driver);
        actions.moveToElement(this.driver.findElement(menuSelection)).moveToElement(this.driver.findElement(tshirtSelection)).perform();
        this.driver.findElement(sizeSelection).click();
        this.driver.findElements(selectItem).get(0).click();
        String currentWindow = this.driver.getWindowHandle();
        this.driver.switchTo().window(currentWindow);
    }

}
