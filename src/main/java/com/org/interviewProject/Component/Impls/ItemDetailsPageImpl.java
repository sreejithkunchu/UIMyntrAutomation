package com.org.interviewProject.Component.Impls;

import com.org.interviewProject.Component.ItemDetailsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;



public class ItemDetailsPageImpl implements ItemDetailsPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public ItemDetailsPageImpl(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 30);
    }

    public void selectSizeAndAddtoCart(String size){

                 this.driver.findElement(selectSize).click();
                 this.driver.findElement(addToCart).click();
    }
}
