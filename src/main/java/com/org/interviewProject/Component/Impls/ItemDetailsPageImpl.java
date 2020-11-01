package com.org.interviewProject.Component.Impls;

import com.org.interviewProject.Component.ItemDetailsPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ItemDetailsPageImpl implements ItemDetailsPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public ItemDetailsPageImpl(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 30);
    }

    public void selectSizeAndAddtoCart(String size) {
        String currentWindow = this.driver.getWindowHandle();
        String newWindow = this.driver.getWindowHandles().stream().filter((window) -> !window.equals(currentWindow)).findFirst().get();
        this.driver.switchTo().window(newWindow);
        wait.until(ExpectedConditions.visibilityOf(this.driver.findElement(selectSize)));
        JavascriptExecutor js = (JavascriptExecutor)this.driver;
        js.executeScript("arguments[0].click();",this.driver.findElement(selectSize));
        this.driver.findElement(addToCart).click();
    }
}
